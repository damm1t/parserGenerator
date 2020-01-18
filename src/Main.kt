import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.nio.file.Files
import java.nio.file.Paths

fun gen(input: String) {
    val lexer = NewGrammarLexer(CharStreams.fromFileName(input))
    val parser = NewGrammarParser(CommonTokenStream(lexer))
    val ctx = parser.start()

    val grammar = Grammar(parser.terminals, parser.nonTerminals, parser.start)
    Files.newBufferedWriter(Paths.get("gen.log")).use { out ->
        out.write(grammar.toString())
    }
    val generator = Generator(grammar, ctx.title, ctx.header, ctx.members)
    generator.generateAll()
}

fun main(args: Array<String>) {
    val inputs = listOf("inputs/grammarArithmetic.txt", "inputs/grammarLab2.txt", "inputs/grammarExpression.txt")
    if (args.isNotEmpty()) {
        gen(inputs[args[0].toInt()])
    } else {
        for (i in inputs) {
            gen(i)
        }
    }
}