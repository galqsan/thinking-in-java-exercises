package volume.five;
//Exercise 6: Create a class with protected data.
// Create a second class in the same file with a method that manipulates the protected data in the first class.

class PrTest {
    protected String s = "num:";
}

public class ExerciseSix {
    PrTest p = new PrTest();

    void dataManiulation() {
        p.s=p.s+45;
        System.out.println(p.s);
    }

    public static void main(String[] args) {
        ExerciseSix e = new ExerciseSix();
        e.dataManiulation();
    }
}
