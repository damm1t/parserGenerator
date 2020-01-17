package generated.arithmetic;
// imports
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;

// fields
class ArithmeticLexer {
    private InputStream input;
    private int curChar, curPos;
    private String curString;
    private ArithmeticToken curToken;
    // constructor
    ArithmeticLexer (InputStream input) throws ParseException {
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
            curToken = ArithmeticToken.END;
            return;
        }
        
        curString = "";
        curToken = ArithmeticToken.END;
        ArithmeticToken prev = ArithmeticToken.END;
        // greedily reading forward to be able to match string tokens
        while (curToken == ArithmeticToken.END) {
            curString = curString.concat(Character.toString((char)curChar));
                switch (curString) {
				case "/":
					nextChar();
					curToken = ArithmeticToken.DIV;
					break;
				case "+":
					nextChar();
					curToken = ArithmeticToken.ADD;
					break;
				case "(":
					nextChar();
					curToken = ArithmeticToken.TERM0;
					break;
				case "*":
					nextChar();
					curToken = ArithmeticToken.MUL;
					break;
				case ")":
					nextChar();
					curToken = ArithmeticToken.TERM1;
					break;
				case "EPS":
					nextChar();
					curToken = ArithmeticToken.EPS;
					break;
				case "^":
					nextChar();
					curToken = ArithmeticToken.POW;
					break;
				case "END":
					nextChar();
					curToken = ArithmeticToken.END;
					break;
				case "-":
					nextChar();
					curToken = ArithmeticToken.MINUS;
					break;
				default:
					if (curString.matches("[1-9][0-9]*|0")) {
						nextChar();
						curToken = ArithmeticToken.NUM;
					} else if ((curChar == -1 || isBlank(curChar)) && prev == ArithmeticToken.END) {
                                    throw new ParseException("Illegal character " + curString.charAt(0) + " at position ", curPos - curString.length());
                                }
                            }
                        // confusing schemes to check if we need to continue reading
                        if (curToken == ArithmeticToken.END) {
                            if (prev != ArithmeticToken.END) {
                                curString = curString.substring(0, curString.length() - 1);
                                curToken = prev;
                            } else {
                                nextChar();
                            }
                        } else {
                            prev = curToken;
                            curToken = ArithmeticToken.END;
                        }
                    }
                }
                // some useless getters
                
                ArithmeticToken getCurToken() {
                    return curToken;
                }

                int getCurPos() {
                    return curPos;
                }

                String getCurString() {
                    return curString;
                }
            }
