package generated.expression;
// imports
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;

// fields
class ExpressionLexer {
    private InputStream input;
    private int curChar, curPos;
    private String curString;
    private ExpressionToken curToken;
    // constructor
    ExpressionLexer (InputStream input) throws ParseException {
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
            curToken = ExpressionToken.END;
            return;
        }
        
        curString = "";
        curToken = ExpressionToken.END;
        ExpressionToken prev = ExpressionToken.END;
        // greedily reading forward to be able to match string tokens
        while (curToken == ExpressionToken.END) {
            curString = curString.concat(Character.toString((char)curChar));
            switch (curString) {
				case "+":
					nextChar();
					curToken = ExpressionToken.ADD;
					break;
				case ";":
					nextChar();
					curToken = ExpressionToken.TERM0;
					break;
				case "*":
					nextChar();
					curToken = ExpressionToken.MUL;
					break;
				case "=":
					nextChar();
					curToken = ExpressionToken.EQUAL;
					break;
				case "(":
					nextChar();
					curToken = ExpressionToken.TERM2;
					break;
				case ")":
					nextChar();
					curToken = ExpressionToken.TERM3;
					break;
				case "EPS":
					nextChar();
					curToken = ExpressionToken.EPS;
					break;
				case "-":
					nextChar();
					curToken = ExpressionToken.MINUS;
					break;
				case "/":
					nextChar();
					curToken = ExpressionToken.DIV;
					break;
				case "^":
					nextChar();
					curToken = ExpressionToken.POW;
					break;
				case "END":
					nextChar();
					curToken = ExpressionToken.END;
					break;
				default:
					if (curString.matches("[a-z]+")) {
						nextChar();
						curToken = ExpressionToken.TERM1;
					} else if (curString.matches("[1-9][0-9]*|0")) {
						nextChar();
						curToken = ExpressionToken.NUM;
					} else if ((curChar == -1 || isBlank(curChar)) && prev == ExpressionToken.END) {
                        throw new ParseException("Illegal character " + curString.charAt(0) + " at position ", curPos - curString.length());
                    }
            }
            // confusing schemes to check if we need to continue reading
            if (curToken == ExpressionToken.END) {
                if (prev != ExpressionToken.END) {
                    curString = curString.substring(0, curString.length() - 1);
                    curToken = prev;
                } else {
                    nextChar();
                }
            } else {
                prev = curToken;
                curToken = ExpressionToken.END;
            }
        }
    }
    // some useless getters
                
    ExpressionToken getCurToken() {
        return curToken;
    }

    int getCurPos() {
        return curPos;
    }

    String getCurString() {
        return curString;
    }
}
