package generated.lab2;

import java.io.InputStream;
import java.text.ParseException;

//class header
public class Lab2Parser {
    // user-defined members
    
    // members
    private Lab2Lexer lex;
    
    // main func, return type same as starting nonterm
    public void parse(InputStream input) throws ParseException {
        lex = new Lab2Lexer(input);
        lex.nextToken();
		or();
	}

	private void or() throws ParseException {

		switch (lex.getCurToken()) {
			case NUM: {
				xor();
				
				or_();
				
				break;
			}
			case NOT: {
				xor();
				
				or_();
				
				break;
			}
			case LPAR: {
				xor();
				
				or_();
				
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
		}
	}
	private void and_() throws ParseException {

		switch (lex.getCurToken()) {
			case RPAR: {

				break;
			}
			case EPS: {

				break;
			}
			case OR: {

				break;
			}
			case XOR: {

				break;
			}
			case END: {

				break;
			}
			case AND: {

				if (lex.getCurToken() != Lab2Token.AND)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				term();
				
				and_();
				
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
		}
	}
	private void and() throws ParseException {

		switch (lex.getCurToken()) {
			case NUM: {
				term();
				
				and_();
				
				break;
			}
			case NOT: {
				term();
				
				and_();
				
				break;
			}
			case LPAR: {
				term();
				
				and_();
				
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
		}
	}
	private void xor() throws ParseException {

		switch (lex.getCurToken()) {
			case NUM: {
				and();
				
				xor_();
				
				break;
			}
			case NOT: {
				and();
				
				xor_();
				
				break;
			}
			case LPAR: {
				and();
				
				xor_();
				
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
		}
	}
	private void term() throws ParseException {

		switch (lex.getCurToken()) {
			case NUM: {

				if (lex.getCurToken() != Lab2Token.NUM)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				break;
			}
			case NOT: {

				if (lex.getCurToken() != Lab2Token.NOT)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				term();
				
				break;
			}
			case LPAR: {

				if (lex.getCurToken() != Lab2Token.LPAR)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				or();
				

				if (lex.getCurToken() != Lab2Token.RPAR)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
		}
	}
	private void xor_() throws ParseException {

		switch (lex.getCurToken()) {
			case RPAR: {

				break;
			}
			case EPS: {

				break;
			}
			case OR: {

				break;
			}
			case XOR: {

				if (lex.getCurToken() != Lab2Token.XOR)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				and();
				
				xor_();
				
				break;
			}
			case END: {

				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
		}
	}
	private void or_() throws ParseException {

		switch (lex.getCurToken()) {
			case RPAR: {

				break;
			}
			case EPS: {

				break;
			}
			case OR: {

				if (lex.getCurToken() != Lab2Token.OR)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				xor();
				
				or_();
				
				break;
			}
			case END: {

				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
		}
	}
}
