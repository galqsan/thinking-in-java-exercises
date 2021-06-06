package volume.three;
//Exercise 5:Repeat Exercise 10 from the previous chapter, using the ternary operator and a bitwise test to display the ones and zeroes, instead of Integer.toBinaryString( ).
public class ExerciseFive {
    static void bin(int n) {
        int v;
        String ni;

        System.out.println("\n Bin = ");
        for (v = 1 << 30; v > 0; v = v / 2) {
            ni = ((n & v) != 0) ? "1" : "0";
            System.out.print(ni);
        }
    }

        public static void main(String[] args) {
        int i = 0x15;
        int j = 0x2a;
        System.out.println("i "+Integer.toBinaryString(i));
        System.out.println("j "+Integer.toBinaryString(j));
        System.out.println("i&j "+Integer.toBinaryString(i&j));
        System.out.println("i|j "+Integer.toBinaryString(i|j));
        System.out.println("i^j "+Integer.toBinaryString(i^j));
        System.out.println("~i "+Integer.toBinaryString(~i));
        System.out.println("~j "+Integer.toBinaryString(~j));
        bin(i);
        bin(j);
        bin(i&j);
        bin(i|j);
        bin(i^j);
        bin(~j);
        bin(~i);

    }
}

