package volume.eleven;

//Exercise 4:Create your own exception class using the extends keyword.
// Write a constructor for this class that takes a String argument and stores it inside the object with a String reference.
// Write a method that displays the stored String.
// Create a try-catch clause to exercise your new exception.
public class ExerciseFourException extends Exception {
    private String s;

    ExerciseFourException(String s) {
        super(s);
        this.s = s;

    }

    void printS() {
        System.out.println(s);
    }

    public static void main(String[] args) {
        try {
            throw new ExerciseFourException("throw ExerciseFourException ");
        } catch (ExerciseFourException e) {
            e.printS();
        }

    }
}
