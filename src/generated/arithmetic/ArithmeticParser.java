package generated.arithmetic;

import java.io.InputStream;
import java.text.ParseException;

//class header
public class ArithmeticParser {
    // user-defined members

    // members
    private ArithmeticLexer lex;

    // main func, return type same as starting nonterm
    public Complex parse(InputStream input) throws ParseException {
        lex = new ArithmeticLexer(input);
        lex.nextToken();
        return add();
    }

    private Complex add() throws ParseException {

        Complex val = null;
        switch (lex.getCurToken()) {
            case TERM0: {
                Complex mul = mul();

                Complex add_ = add_(mul);
                val = add_;
                break;
            }
            case TERM3: {
                Complex mul = mul();

                Complex add_ = add_(mul);
                val = add_;
                break;
            }
            default:
                throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
        }
        return val;
    }

    private Complex add_(Complex acc) throws ParseException {

        Complex val = null;
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
                Complex mul = mul();
                Complex res = Complex.cadd(acc, mul);
                Complex add_ = add_(res);
                val = add_;
                break;
            }
            case TERM4: {
                val = acc;
                break;
            }
            case MINUS: {

                if (lex.getCurToken() != ArithmeticToken.MINUS)
                    throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
                lex.nextToken();
                Complex mul = mul();
                Complex res = Complex.csub(acc, mul);
                Complex add_ = add_(res);
                val = add_;
                break;
            }
            default:
                throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
        }
        return val;
    }

    private Complex mul() throws ParseException {

        Complex val = null;
        switch (lex.getCurToken()) {
            case TERM0: {
                Complex term = term();

                Complex mul_ = mul_(term);
                val = mul_;
                break;
            }
            case TERM3: {
                Complex term = term();

                Complex mul_ = mul_(term);
                val = mul_;
                break;
            }
            default:
                throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
        }
        return val;
    }

    private Complex mul_(Complex acc) throws ParseException {

        Complex val = null;
        switch (lex.getCurToken()) {
            case END: {
                val = acc;
                break;
            }
            case MUL: {

                if (lex.getCurToken() != ArithmeticToken.MUL)
                    throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
                lex.nextToken();
                Complex term = term();
                Complex res = Complex.cmul(acc, term);
                Complex mul_ = mul_(res);
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
            case TERM4: {
                val = acc;
                break;
            }
            case DIV: {

                if (lex.getCurToken() != ArithmeticToken.DIV)
                    throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
                lex.nextToken();
                Complex term = term();
                Complex res = Complex.cdiv(acc, term);
                Complex mul_ = mul_(res);
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

    private int num1() throws ParseException {

        int val = 0;
        switch (lex.getCurToken()) {
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

    private Complex term() throws ParseException {

        Complex val = null;
        switch (lex.getCurToken()) {
            case TERM0: {

                if (lex.getCurToken() != ArithmeticToken.TERM0)
                    throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
                lex.nextToken();
                int num1 = num1();


                if (lex.getCurToken() != ArithmeticToken.TERM1)
                    throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
                lex.nextToken();
                int num2 = num2();

                val = new Complex(num1, num2);
                if (lex.getCurToken() != ArithmeticToken.TERM2)
                    throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
                lex.nextToken();
                break;
            }
            case TERM3: {

                if (lex.getCurToken() != ArithmeticToken.TERM3)
                    throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
                lex.nextToken();
                Complex add = add();

                val = add;
                if (lex.getCurToken() != ArithmeticToken.TERM4)
                    throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
                lex.nextToken();
                break;
            }
            default:
                throw new IllegalArgumentException("Unexpected token " + lex.getCurString() + " at position: " + (lex.getCurPos() - 1));
        }
        return val;
    }

    private int num2() throws ParseException {

        int val = 0;
        switch (lex.getCurToken()) {
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
