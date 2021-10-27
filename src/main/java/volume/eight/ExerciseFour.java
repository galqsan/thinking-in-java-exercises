package volume.eight;

//Exercise 4:Create an abstract class with no methods.
// Derive a class and add a method. Create a static method that takes a reference to the base class, downcasts it to the derived class, and calls the method.
// In main( ), demonstrate that it works.
// Now put the abstract declaration for the method in the base class, thus eliminating the need for the downcast.
abstract class ExFour {
    abstract void f();
}

public class ExerciseFour extends ExFour {
    void f() {
        System.out.println("f()");
    }

    static void staticM(ExFour exFour) {
        // ((ExerciseFour) exFour).f();
        exFour.f();
    }

    public static void main(String[] args) {
        ExerciseFour four = new ExerciseFour();
        staticM(four);
    }
}
