package generated.arithmetic;

import java.io.InputStream;
import java.text.ParseException;

//class header
public class ArithmeticParser {
    // user-defined members
    
    // members
    private ArithmeticLexer lex;
    
    // main func, return type same as starting nonterm
    public int parse(InputStream input) throws ParseException {
        lex = new ArithmeticLexer(input);
        lex.nextToken();
		return add();
	}

	private int add() throws ParseException {

		int val = 0;
		switch (lex.getCurToken()) {
			case TERM0: {
				int mul = mul();
				
				int add_ = add_(mul);
				val = add_;
				break;
			}
			case NUM: {
				int mul = mul();
				
				int add_ = add_(mul);
				val = add_;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
		}
		return val;
	}
	private int add_(int acc) throws ParseException {

		int val = 0;
		switch (lex.getCurToken()) {
			case END: {
val = acc;
				break;
			}
			case EPS: {
val = acc;
				break;
			}
			case ADD: {

				if (lex.getCurToken() != ArithmeticToken.ADD)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				int mul = mul();
				int res = acc + mul;
				int add_ = add_(res);
				val = add_;
				break;
			}
			case TERM1: {
val = acc;
				break;
			}
			case MINUS: {

				if (lex.getCurToken() != ArithmeticToken.MINUS)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				int mul = mul();
				int res = acc - mul;
				int add_ = add_(res);
				val = add_;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
		}
		return val;
	}
	private int mul() throws ParseException {

		int val = 0;
		switch (lex.getCurToken()) {
			case TERM0: {
				int term = term();
				
				int mul_ = mul_(term);
				val = mul_;
				break;
			}
			case NUM: {
				int term = term();
				
				int mul_ = mul_(term);
				val = mul_;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
		}
		return val;
	}
	private int mul_(int acc) throws ParseException {

		int val = 0;
		switch (lex.getCurToken()) {
			case END: {
val = acc;
				break;
			}
			case MUL: {

				if (lex.getCurToken() != ArithmeticToken.MUL)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				int term = term();
				int res = acc * term;
				int mul_ = mul_(res);
				val = mul_;
				break;
			}
			case EPS: {
val = acc;
				break;
			}
			case ADD: {
val = acc;
				break;
			}
			case TERM1: {
val = acc;
				break;
			}
			case DIV: {

				if (lex.getCurToken() != ArithmeticToken.DIV)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				int term = term();
				int res = acc / term;
				int mul_ = mul_(res);
				val = mul_;
				break;
			}
			case MINUS: {
val = acc;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
		}
		return val;
	}
	private int term() throws ParseException {

		int val = 0;
		switch (lex.getCurToken()) {
			case TERM0: {

				if (lex.getCurToken() != ArithmeticToken.TERM0)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				int add = add();
				
val = add;
				if (lex.getCurToken() != ArithmeticToken.TERM1)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				break;
			}
			case NUM: {
val = Integer.parseInt(lex.getCurString());
				if (lex.getCurToken() != ArithmeticToken.NUM)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
		}
		return val;
	}
}
