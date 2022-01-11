package volume.eleven;

//Exercise 2:Define an object reference and initialize it to null. Try to call a method through this reference.
// Now wrap the code in a try-catch clause to catch the exception.
public class ExerciseTwo {
    public static void main(String[] args) {
        String s = null;
        try {
            s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
