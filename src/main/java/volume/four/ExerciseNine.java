package volume.four;

//Exercise 9:Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.
public class ExerciseNine {
    ExerciseNine() {
        this(11);
        System.out.println("First constructor");
    }

    ExerciseNine(int i) {
        System.out.println("Second constructor");
    }

    public static void main(String[] args) {
        new ExerciseNine();
    }
}
