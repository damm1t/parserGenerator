import java.io.File
import java.io.PrintWriter
import java.lang.AssertionError

class Generator internal constructor(
    private val grammar: Grammar,
    private val name: String,
    private val header: String,
    private val members: String
) {
    private val directory = "src/generated/${name.toLowerCase()}"
    private val packageString = "package generated.${name.toLowerCase()};"

    internal fun generateAll() {
        val dir = File(directory)
        if (!dir.isDirectory && !dir.mkdirs()) {
            throw AssertionError("Can't create directory ${dir.absoluteFile}")
        }
        generateToken()
        generateLexer()
        generateParser()
        generateMain()
    }

    private fun generateToken() {
        val tokenName = "${name}Token"
        val file = File(directory, "$tokenName.java")
        PrintWriter(file).use { out ->
            out.println(packageString)
            out.println("public enum $tokenName {")
            // printing all the terminals' names as enum members
            val sb = StringBuilder()
            for (term in grammar.terminals.keys) {
                sb.append("\t").append(term.toUpperCase()).append(", \n")
            }
            // an easy way to remove last comma
            if (sb.length >= 3)
                out.println(sb.delete(sb.length - 3, sb.length).toString())
            out.println("}")
        }
    }

    private fun generateLexer() {
        val lexerName = "${name}Lexer"
        val file = File(directory, "$lexerName.java")
        PrintWriter(file).use { out ->
            out.println(
                """
            $packageString
            // imports
            import java.io.IOException;
            import java.io.InputStream;
            import java.text.ParseException;
            
            // fields
            class $lexerName {
                private InputStream input;
                private int curChar, curPos;
                private String curString;
                private ${name}Token curToken;
                // constructor
                $lexerName (InputStream input) throws ParseException {
                    this.input = input;
                    curPos = 0;
                    nextChar();
                }
                
                // isBlank
                private boolean isBlank(int c) {
                    return Character.isWhitespace(c);
                }
                
                // nextChar
                private void nextChar() throws ParseException {
                    curPos++;
                    try {
                        curChar = input.read();
                    } catch (IOException e) {
                        throw new ParseException(e.getMessage(), curPos);
                    }
                }
                // nextToken
                void nextToken() throws ParseException {
                    // skipping blanks
                    while (isBlank(curChar)) {
                        nextChar();
                    }
                    // if EOF found return END token
                    if (curChar == -1) {
                        curToken = ${name}Token.END;
                        return;
                    }
                    
                    curString = "";
                    curToken = ${name}Token.END;
                    ${name}Token prev = ${name}Token.END;
                    // greedily reading forward to be able to match string tokens
                    while (curToken == ${name}Token.END) {
                        curString = curString.concat(Character.toString((char)curChar));
                            switch (curString) {
            """.trimIndent()
            )
            // printing all terminals as switch cases
            // if one matches, read next char and write the corresponding token to curToken
            for (terminal in grammar.terminals.values) {
                for (string in terminal.strings) {
                    out.println("\t\t\t\tcase \"$string\":")
                    out.println("\t\t\t\t\tnextChar();")
                    out.println("\t\t\t\t\tcurToken = ${name}Token.${terminal.name.toUpperCase()};")
                    out.println("\t\t\t\t\tbreak;")
                }
            }
            out.println("\t\t\t\tdefault:")
            out.print("\t\t\t\t\t")
            // here we print all the regexp representations of terminals
            for (terminal in grammar.terminals.values) {
                for (regex in terminal.regex) {
                    out.println("if (curString.matches(\"${regex.substring(1, regex.length - 1)}\")) {")
                    out.println("\t\t\t\t\t\tnextChar();")
                    out.println("\t\t\t\t\t\tcurToken = ${name}Token.${terminal.name.toUpperCase()};")
                    out.print("\t\t\t\t\t} else ")
                }
            }
            // we went all the way to the eof and could not determine char sequence
            out.println(
                """if ((curChar == -1 || isBlank(curChar)) && prev == ${name}Token.END) {
                                    throw new ParseException("Illegal character " + curString.charAt(0) + " at position ", curPos - curString.length());
                                }
                            }
                        // confusing schemes to check if we need to continue reading
                        if (curToken == ${name}Token.END) {
                            if (prev != ${name}Token.END) {
                                curString = curString.substring(0, curString.length() - 1);
                                curToken = prev;
                            } else {
                                nextChar();
                            }
                        } else {
                            prev = curToken;
                            curToken = ${name}Token.END;
                        }
                    }
                }
                // some useless getters
                
                ${name}Token getCurToken() {
                    return curToken;
                }

                int getCurPos() {
                    return curPos;
                }

                String getCurString() {
                    return curString;
                }
            }
            """.trimIndent()
            )
        }
    }

    private fun generateParser() {
        val parserName = "${name}Parser"
        val lexerName = "${name}Lexer"
        val file = File(directory, "$parserName.java")
        PrintWriter(file).use { out ->

            out.println(
                """
            $packageString
            $header
            import java.io.InputStream;
            import java.text.ParseException;
            
            //class header
            public class $parserName {
                // user-defined members
                $members
                // members
                private ${lexerName} lex;
                
                // main func, return type same as starting nonterm
                public ${grammar.start.returnType()} parse(InputStream input) throws ParseException {
                    lex = new $lexerName(input);
                    lex.nextToken();
            """.trimIndent()
            )
            /*out.println(packageString)
            // user-defined imports
            out.println(header)
            // imports
            out.println("import java.io.InputStream;")
            out.println("import java.text.ParseException;\n")
            // class header
            out.println("public class $parserName {")
            // user-defined members
            out.println(members)
            // members
            out.println("\tprivate $lexerName lex;\n")
            // main func, return type same as starting nonterm
            out.println("\tpublic ${grammar.start.returnType()} parse(InputStream input) throws ParseException {")
            out.println("\t\tlex = new $lexerName(input);")
            out.println("\t\tlex.nextToken();")
            */
            out.print("\t\t")
            if (grammar.start.returnType() != "void") out.print("return ")
            out.println("${grammar.start.name}();")
            out.println("\t}\n")

            // generate a function for each nonterm
            val table = grammar.table
            for ((key, nonTerminal) in grammar.nonTerminals) {
                // return type & name for a nonterm
                out.print("\tprivate ${nonTerminal.returnType()} $key(")
                // inherited attrs as func args
                val arguments = StringBuilder()
                for (attribute in nonTerminal.arguments) {
                    arguments.append(attribute.type).append(" ").append(attribute.name).append(", ")
                }
                // removing last comma
                if (arguments.length >= 2)
                    out.print(arguments.delete(arguments.length - 2, arguments.length).toString())
                out.println(") throws ParseException {")

                // user-defined init
                out.println(nonTerminal.init)
                // declare return val
                if (nonTerminal.returnType() != "void")
                    out.println(
                        "\t\t${nonTerminal.returnType()} ${nonTerminal.returnAttribute.name} = ${defaultValue(
                            nonTerminal.returnType()
                        )};"
                    )

                // here start the rules
                out.println("\t\tswitch (lex.getCurToken()) {")
                for ((terminal, rule) in table[nonTerminal]!!) {
                    // a case for each possible term
                    out.println("\t\t\tcase ${terminal.name.toUpperCase()}: {")
                    // check whether it was not inferred through EPS rule
                    val own = rule.head().name != grammar.EPS.name
                    for (i in rule.units.indices) {
                        val element = rule.units[i].element
                        if (element is Terminal) {
                            out.println(rule.units[i].code)
                            if (own) {
                                out.println("\t\t\t\tif (lex.getCurToken() != ${name}Token.${element.name})")
                                out.println("\t\t\t\t\tthrow new IllegalArgumentException(\"Unexpected token \" + lex.getCurString() + \" at position: \" + (lex.getCurPos() - 1));")
                                out.println("\t\t\t\tlex.nextToken();")
                            }
                        } else {
                            // here we are going to call nonterms from rule
                            if (element.returnType() != "void") {
                                out.print("\t\t\t\t${element.returnType()} ${element.name} = ${element.name}(")
                                val args = StringBuilder()
                                for (arg in rule.units[i].args) {
                                    args.append(arg).append(", ")
                                }
                                if (args.length >= 2)
                                    out.print(args.delete(args.length - 2, args.length).toString())
                                out.println(");")
                            } else {
                                out.println("\t\t\t\t${element.name}();")
                            }
                            out.println("\t\t\t\t${rule.units[i].code}")
                        }
                    }
                    out.println("\t\t\t\tbreak;\n\t\t\t}")
                }

                out.print(
                    "\t\t\tdefault:\n" +
                            "\t\t\t\tthrow new IllegalArgumentException(\"Unexpected token \" + lex.getCurString() + \" at position: \" + (lex.getCurPos() - 1));\n" +
                            "\t\t}\n"
                )
                if (nonTerminal.returnType() != "void") {
                    out.println("\t\treturn ${nonTerminal.returnAttribute.name};")
                }
                out.println("\t}")
            }

            out.print("}\n")
        }
    }

    private fun generateMain() {
        val returnsVoid = grammar.start.returnType() == "void"
        val file = File(directory, "Main.java")
        PrintWriter(file).use { out ->

            out.println(
                """
            $packageString
            import java.io.*;
            import java.text.ParseException;
            import java.nio.charset.StandardCharsets;
            // Main class
             
            public class Main {
                public static void main(String[] args) {
                    ${name}Parser parser = new ${name}Parser();
            """.trimIndent()
            )
            if (!returnsVoid) {
                out.println("\t\t${grammar.start.returnType()} res;")
            }
            out.println("\t\ttry {")
            out.println("\t\t\tif (args.length != 0) {")
            out.println("\t\t\t\ttry {")
            if (!returnsVoid) {
                out.println("\t\t\t\t\tres = parser.parse(new ByteArrayInputStream(args[0].getBytes(StandardCharsets.UTF_8.name())));")
                out.println("\t\t\t\t\tSystem.out.println(res);")
            } else {
                out.println("\t\t\t\t\tparser.parse(new ByteArrayInputStream(args[0].getBytes(StandardCharsets.UTF_8.name())));")
            }
            out.println("\t\t\t\t} catch (UnsupportedEncodingException e) {")
            out.println("\t\t\t\t\tSystem.err.println(e.getMessage());")
            out.println("\t\t\t\t\tSystem.exit(1);")
            out.println("\t\t\t\t}")
            out.println("\t\t\t} else {")
            out.println("\t\t\t\ttry {")
            out.println("\t\t\t\t\tInputStream input = new FileInputStream(new File(\"inputs/${name.toLowerCase()}_input.txt\"));")
            if (!returnsVoid) {
                out.println("\t\t\t\t\tres = parser.parse(input);")
                out.println("\t\t\t\t\tSystem.out.println(res);")
            } else {
                out.println("\t\t\t\t\tparser.parse(input);")
            }
            out.println(
                """
                            } catch (FileNotFoundException e) {
                                System.err.println(e.getMessage());
                                System.exit(1);
                            }
                        }
                    } catch (ParseException e) {
                        System.err.println("Parser failed: \nCause: " + e.getMessage() + e.getErrorOffset());
                        System.exit(1);
                    }
                }
            }
            """.trimIndent()
            )
        }
    }

    private fun defaultValue(name: String): String {
        return if (Character.isUpperCase(name[0]))
            "null"
        else {
            if (name == "boolean")
                "false"
            else
                "0"
        }
    }
}
