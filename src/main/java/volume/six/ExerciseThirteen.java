package volume.six;

//Exercise 13: Create a class with a method that is overloaded three times.
// Inherit a new class, add a new overloading of the method, and show that all four methods are available in the derived class.
class ThirteenBase {
    int overloadMethod(int i) {
        System.out.println("Overload Method (int)");
        return 5;
    }

    char overloadMethod(char a) {
        System.out.println("Overload Method (char)");
        return 'y';
    }

    float overloadMethod(float f) {
        System.out.println("Overload Method (fload)");
        return 45f;
    }
}

public class ExerciseThirteen extends ThirteenBase {
    boolean overloadMethod(boolean b) {
        System.out.println("Overload Method (boolean)");
        return true;
    }

    public static void main(String[] args) {
        ExerciseThirteen t = new ExerciseThirteen();
        t.overloadMethod(5);
        t.overloadMethod('a');
        t.overloadMethod(5f);
        t.overloadMethod(false);

    }
}
