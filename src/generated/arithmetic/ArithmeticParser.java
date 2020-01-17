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

		int val;
		switch (lex.getCurToken()) {
			case NUM: {
				int mul = mul();

				val = add_(mul);
				break;
			}
			case TERM0: {
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
			case EPS: {
val = acc;
				break;
			}
			case TERM1: {
val = acc;
				break;
			}
			case END: {
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
	private int pow_() throws ParseException {

		int val = 0;
		switch (lex.getCurToken()) {
			case POW: {

				if (lex.getCurToken() != ArithmeticToken.POW)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				int term = term();
				
				int pow_ = pow_();
				val = (int)Math.pow(term, pow_);
				break;
			}
			case DIV: {
val = 1;
				break;
			}
			case ADD: {
val = 1;
				break;
			}
			case EPS: {
val = 1;
				break;
			}
			case TERM1: {
val = 1;
				break;
			}
			case END: {
val = 1;
				break;
			}
			case MINUS: {
val = 1;
				break;
			}
			case MUL: {
val = 1;
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
			case NUM: {
				int pow = pow();
				
				int mul_ = mul_(pow);
				val = mul_;
				break;
			}
			case TERM0: {
				int pow = pow();
				
				int mul_ = mul_(pow);
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
			case DIV: {

				if (lex.getCurToken() != ArithmeticToken.DIV)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				int pow = pow();
				int res = acc / pow;
				int mul_ = mul_(res);
				val = mul_;
				break;
			}
			case ADD: {
val = acc;
				break;
			}
			case EPS: {
val = acc;
				break;
			}
			case TERM1: {
val = acc;
				break;
			}
			case END: {
val = acc;
				break;
			}
			case MINUS: {
val = acc;
				break;
			}
			case MUL: {

				if (lex.getCurToken() != ArithmeticToken.MUL)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				int pow = pow();
				int res = acc * pow;
				int mul_ = mul_(res);
				val = mul_;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
		}
		return val;
	}
	private int pow() throws ParseException {

		int val = 0;
		switch (lex.getCurToken()) {
			case NUM: {
				int term = term();
				
				int pow_ = pow_();
				val = (int)Math.pow(term, pow_);
				break;
			}
			case TERM0: {
				int term = term();
				
				int pow_ = pow_();
				val = (int)Math.pow(term, pow_);
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
			case NUM: {
val = Integer.parseInt(lex.getCurString());
				if (lex.getCurToken() != ArithmeticToken.NUM)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				break;
			}
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
			default:
				throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
		}
		return val;
	}
}
