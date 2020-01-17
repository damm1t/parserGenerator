package generated.lab2;
// imports
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;

// fields
class Lab2Lexer {
    private InputStream input;
    private int curChar, curPos;
    private String curString;
    private Lab2Token curToken;
    // constructor
    Lab2Lexer (InputStream input) throws ParseException {
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
            curToken = Lab2Token.END;
            return;
        }
        
        curString = "";
        curToken = Lab2Token.END;
        Lab2Token prev = Lab2Token.END;
        // greedily reading forward to be able to match string tokens
        while (curToken == Lab2Token.END) {
            curString = curString.concat(Character.toString((char)curChar));
            switch (curString) {
				case "!":
					nextChar();
					curToken = Lab2Token.NOT;
					break;
				case "|":
					nextChar();
					curToken = Lab2Token.OR;
					break;
				case "(":
					nextChar();
					curToken = Lab2Token.LPAR;
					break;
				case "&":
					nextChar();
					curToken = Lab2Token.AND;
					break;
				case "EPS":
					nextChar();
					curToken = Lab2Token.EPS;
					break;
				case ")":
					nextChar();
					curToken = Lab2Token.RPAR;
					break;
				case "^":
					nextChar();
					curToken = Lab2Token.XOR;
					break;
				case "END":
					nextChar();
					curToken = Lab2Token.END;
					break;
				default:
					if (curString.matches("[a-z]+")) {
						nextChar();
						curToken = Lab2Token.NUM;
					} else if ((curChar == -1 || isBlank(curChar)) && prev == Lab2Token.END) {
                        throw new ParseException("Illegal character " + curString.charAt(0) + " at position ", curPos - curString.length());
                    }
            }
            // confusing schemes to check if we need to continue reading
            if (curToken == Lab2Token.END) {
                if (prev != Lab2Token.END) {
                    curString = curString.substring(0, curString.length() - 1);
                    curToken = prev;
                } else {
                    nextChar();
                }
            } else {
                prev = curToken;
                curToken = Lab2Token.END;
            }
        }
        System.out.println(curToken.toString());
    }
    // some useless getters
                
    Lab2Token getCurToken() {
        return curToken;
    }

    int getCurPos() {
        return curPos;
    }

    String getCurString() {
        return curString;
    }
}
