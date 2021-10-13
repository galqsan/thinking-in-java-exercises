package volume.six;

//Exercise 23: Prove that class loading takes place only once.
// Prove that loading may be caused by either the creation of the first instance of that class or by the access of a static member.
class TwentyThreeB {

    static int i1 = printInt("static i1 class TwentyThreeB ");

    public static int printInt(String s) {
        System.out.println(s);
        return 23;
    }

    TwentyThreeB() {
        System.out.println("constructor class TwentyThreeB");
    }
}

class TwentyThreeD extends TwentyThreeB {
    private static int i2 = printInt("static i2 TwentyThreeD");

    TwentyThreeD() {
        System.out.println("TwentyThreeD constructor");
    }
}

public class ExerciseTwentyThree {
    ExerciseTwentyThree() {
        System.out.println("ExerciseTwentyThree constructor");
    }

    public static void main(String[] args) {
        TwentyThreeD twentyThreeD = new TwentyThreeD();
        new ExerciseTwentyThree();


    }

}
