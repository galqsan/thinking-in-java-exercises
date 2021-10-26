package volume.eight;

//Exercise 2:Create a class as abstract without including any abstract methods and verify that you cannot create any instances of that class.
public abstract class ExerciseTwo {
    void a() {
        System.out.println("ExerciseTwo.a()");
    }

    public static void main(String[] args) {
        // new ExerciseTwo();//'ExerciseTwo' is abstract; cannot be instantiated
    }
}
