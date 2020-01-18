package generated.expression;
import java.util.HashMap;
import java.io.InputStream;
import java.text.ParseException;

//class header
public class ExpressionParser {
    // user-defined members
    HashMap<String, Integer> variables = new HashMap<>();
    // members
    private ExpressionLexer lex;
    
    // main func, return type same as starting nonterm
    public void parse(InputStream input) throws ParseException {
        lex = new ExpressionLexer(input);
        lex.nextToken();
		expr();
	}

	private int add() throws ParseException {

		int val = 0;
		switch (lex.getCurToken()) {
			case TERM1: {
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
			case TERM2: {
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
			case MINUS: {

				if (lex.getCurToken() != ExpressionToken.MINUS)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				int mul = mul();
				int res = acc - mul;
				int add_ = add_(res);
				val = add_;
				break;
			}
			case TERM3: {
val = acc;
				break;
			}
			case TERM0: {
val = acc;
				break;
			}
			case ADD: {

				if (lex.getCurToken() != ExpressionToken.ADD)
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
			default:
				throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
		}
		return val;
	}
	private int pow_() throws ParseException {

		int val = 0;
		switch (lex.getCurToken()) {
			case POW: {

				if (lex.getCurToken() != ExpressionToken.POW)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				int term = term();
				
				int pow_ = pow_();
				val = (int)Math.pow(term, pow_);
				break;
			}
			case MINUS: {
val = 1;
				break;
			}
			case TERM3: {
val = 1;
				break;
			}
			case DIV: {
val = 1;
				break;
			}
			case TERM0: {
val = 1;
				break;
			}
			case ADD: {
val = 1;
				break;
			}
			case MUL: {
val = 1;
				break;
			}
			case EPS: {
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
			case TERM1: {
				int pow = pow();
				
				int mul_ = mul_(pow);
				val = mul_;
				break;
			}
			case NUM: {
				int pow = pow();
				
				int mul_ = mul_(pow);
				val = mul_;
				break;
			}
			case TERM2: {
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
	private String setVar() throws ParseException {

		String result = null;
		switch (lex.getCurToken()) {
			case TERM1: {
				String variable = variable();
				

				if (lex.getCurToken() != ExpressionToken.EQUAL)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				int add = add();
				int addResult = add;
        variables.put(variable, addResult);
        result = variable + " = " + String.valueOf(addResult);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
		}
		return result;
	}
	private String variable() throws ParseException {

		String name = null;
		switch (lex.getCurToken()) {
			case TERM1: {
name = lex.getCurString();
				if (lex.getCurToken() != ExpressionToken.TERM1)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
		}
		return name;
	}
	private int mul_(int acc) throws ParseException {

		int val = 0;
		switch (lex.getCurToken()) {
			case MINUS: {
val = acc;
				break;
			}
			case TERM3: {
val = acc;
				break;
			}
			case DIV: {

				if (lex.getCurToken() != ExpressionToken.DIV)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				int pow = pow();
				int res = acc / pow;
				int mul_ = mul_(res);
				val = mul_;
				break;
			}
			case TERM0: {
val = acc;
				break;
			}
			case ADD: {
val = acc;
				break;
			}
			case MUL: {

				if (lex.getCurToken() != ExpressionToken.MUL)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				int pow = pow();
				int res = acc * pow;
				int mul_ = mul_(res);
				val = mul_;
				break;
			}
			case EPS: {
val = acc;
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
			case TERM1: {
				int term = term();
				
				int pow_ = pow_();
				val = (int)Math.pow(term, pow_);
				break;
			}
			case NUM: {
				int term = term();
				
				int pow_ = pow_();
				val = (int)Math.pow(term, pow_);
				break;
			}
			case TERM2: {
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
	private void expr() throws ParseException {

		switch (lex.getCurToken()) {
			case TERM1: {
				String setVar = setVar();
				System.out.println(setVar);

				if (lex.getCurToken() != ExpressionToken.TERM0)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				expr();
				
				break;
			}
			case END: {

				break;
			}
			case EPS: {

				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
		}
	}
	private int term() throws ParseException {

		int val = 0;
		switch (lex.getCurToken()) {
			case TERM1: {
				String variable = variable();
				val = variables.get(variable);
				break;
			}
			case NUM: {
val = Integer.parseInt(lex.getCurString());
				if (lex.getCurToken() != ExpressionToken.NUM)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				break;
			}
			case TERM2: {

				if (lex.getCurToken() != ExpressionToken.TERM2)
					throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
				lex.nextToken();
				int add = add();
				
val = add;
				if (lex.getCurToken() != ExpressionToken.TERM3)
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
