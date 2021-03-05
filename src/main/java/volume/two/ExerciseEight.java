package volume.two;
//Exercise 8: Show that hex and octal notations work with long values.
// Use Long.toBinaryString( ) to display the results.
public class ExerciseEight {
    public static void main(String[] args) {

        int i1 = 0Xfffff;
        System.out.println("int hex : " + Long.toBinaryString(i1));
        int i2 = 07777;
        System.out.println("int oct : " + Long.toBinaryString(i2));
        char c1 = 0xff;
        System.out.println("char hex : " + Long.toBinaryString(c1));
        char c2=07;
        System.out.println("Char oct "+ Long.toBinaryString(c2));
        byte b1 = 0x7f;
        System.out.println("byte hex : " + Long.toBinaryString(b1));
        byte b2= 06;
        System.out.println("byte oct: "+ Long.toBinaryString(b2));
        short s = 0x7fff;
        System.out.println("short hex : " + Long.toBinaryString(s));
        short s2 =0564;
        System.out.println("short oct: "+ Long.toBinaryString(s2));
        long l1 = 0x9a;
        System.out.println("Long hex "+Long.toBinaryString(l1));
        long l2=035;
        System.out.println("long oct: "+ Long.toBinaryString(l2));

    }
}

