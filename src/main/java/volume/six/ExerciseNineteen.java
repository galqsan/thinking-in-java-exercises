package volume.six;

//Exercise 19:Create a class with a blank final reference to an object.
// Perform the initialization of the blank final inside all constructors.
// Demonstrate the guarantee that the final must be initialized before use, and that it cannot be changed once initialized.
public class ExerciseNineteen {
    private final ExerciseNineteen nineteen;
    private final Game g;
    private final String s;

    ExerciseNineteen() {
        s = "j";
        nineteen = new ExerciseNineteen();
        g = new Game(5);
    }

    ExerciseNineteen(int x) {
        s = "x";
        g = new Game(x);
        nineteen = new ExerciseNineteen();
    }

    public static void main(String[] args) {
        final int p;
        //System.out.println(p);//p cannot be used  before initialization
        new ExerciseNineteen(5);
        p = 2;
        // p=23;//cannot be initialized again

    }
}
