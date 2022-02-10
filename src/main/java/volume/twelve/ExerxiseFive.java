package volume.twelve;

import java.math.BigInteger;
import java.util.Formatter;

//Exercise 5: For each of the basic conversion types in the above table, write the most
//complex formatting expression possible. That is, use all the possible format specifiers
//available for that conversion type.
public class ExerxiseFive {
    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);
        char c = 'a';
        System.out.println("c = ‘a’");
        f.format("s: %1$-5s\n", c);
        f.format("c: %1$-5c\n", c);
        f.format("b: %1$-5.5b\n", c);
        f.format("h: %1$-5.5h\n", c);
        int v = 121;
        System.out.println("v = 121");
        f.format("d: %1$-(,5d\n", -v);
        f.format("c v=121: %1$-5c\n", 121);
        f.format("b: %1$-5.5b\n", v);
        f.format("s: %1$-5.5s\n", v);
        f.format("x: %1$-#5x\n", v);
        f.format("h: %1$-5.5h\n", v);
        BigInteger w = new BigInteger("50000000000000");
        System.out.println(
                "w = new BigInteger(\"50000000000000\")");
        f.format("d: %1$(,0+10d\n", w);
        f.format("b: %1$-5.5b\n", w);
        f.format("s: %1$-5.5s\n", w);
        f.format("x 1: %1$(0+5x\n", w);
        f.format("x 2, w = -w: %1$-( 5x\n", w.negate());
        f.format("h: %1$-5.5h\n", w);
        double x = 179.543;
        System.out.println("x = 179.543");
        f.format("b: %1$-5b\n", x);
        f.format("s: %1$-5.5s\n", x);
        f.format("f 1: %1$#(,- 5.2f\n", x);
        f.format("f 2, x = -x: %1$#(,0+5.2f\n", -x);
        f.format("e 1: %1$#(- 5.2e\n", x);
        f.format("e 2, x = -x: %1$#(0+5.2e\n", -x);
        f.format("h: %1$-5.5h\n", x);
        Object y = new Object();
        System.out.println("y =new Object();");
        f.format("b: %1$-5.5b\n", y);
        f.format("s: %1$-5.5s\n", y);
        f.format("h: %1$-5.5h\n", y);
        boolean z = false;
        System.out.println("z = false");
        f.format("b: %1$-5.5b\n", z);
        f.format("s: %1$-5.5s\n", z);
        f.format("h: %1$-5.5h\n", z);
        f.format("%%: %-5%");
    }
}
