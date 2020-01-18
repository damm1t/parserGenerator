package generated.arithmetic;

public class Complex {

    int x, y;

    public Complex(int a, int b) {
        x = a;
        y = b;
    }

    public static Complex cadd(Complex fst, Complex snd) {
        return new Complex(fst.x + snd.x, fst.y + snd.y);
    }

    public static Complex csub(Complex fst, Complex snd) {
        return new Complex(fst.x - snd.x, fst.y - snd.y);
    }

    public static Complex cmul(Complex fst, Complex snd) {
        return new Complex(fst.x * snd.x - fst.y * snd.y, fst.x * snd.y + fst.y * snd.x);
    }

    public static Complex cdiv(Complex fst, Complex snd) {
        int d = snd.x * snd.x + snd.y * snd.y;
        return new Complex((fst.x * snd.x + fst.y * snd.y) / d, (fst.y * snd.x - fst.x * snd.y) / d);
    }

    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}
