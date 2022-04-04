package volume.twelve;

import java.util.Locale;
import java.util.Scanner;

//Exercise 20: Create a class that contains int, long, float and double and String
//fields. Create a constructor for this class that takes a single String argument, and scans that
//string into the various fields. Add a toString( ) method and demonstrate that your class
//works correctly.
public class ExerciseTwenty {
    private int i;
    private long l;
    private float f;
    private double d;
    private String s;

    ExerciseTwenty(String s) {
        Scanner scanner = new Scanner(s);
        this.s = scanner.next("\\w+");
        i = scanner.nextInt();
        f = scanner.nextFloat();
        d = scanner.nextDouble();
        l = scanner.nextLong();
    }

    public String toString() {
        return "String: " + s + " int=" + i + " long= " + l + " float= " + f + " double= " + d;
    }

    public static void main(String[] args) {
        ExerciseTwenty twenty = new ExerciseTwenty("ExerciseTwenty 5 5.6 5.64 656 ");
        System.out.println(twenty);
    }

}
