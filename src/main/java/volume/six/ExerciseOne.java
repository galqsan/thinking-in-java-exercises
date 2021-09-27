package volume.six;

//Exercise 1:Create a simple class.
// Inside a second class, define a reference to an object of the first class.
// Use lazy initialization to instantiate this object.
class TestOneEx {
    private String s;

    TestOneEx() {
        System.out.println("Test");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}

public class ExerciseOne {
    static TestOneEx testOneEx;
    private String s1;

    public String toString() {
        if (s1 == null) {
            s1 = "ExerciseOne";
        }
        return "s1 = " + s1 + " testOneEx = " + testOneEx;
    }

    public static void main(String[] args) {

        testOneEx = new TestOneEx();
        System.out.println(testOneEx);
        ExerciseOne exerciseOne = new ExerciseOne();
        System.out.println(exerciseOne);
    }
}
