package volume.eleven;

//Exercise 1: (2) Create a class with a main( ) that throws an object of class Exception inside a try block.
// Give the constructor for Exception a String argument. Catch the exception inside a catch clause and print the String argument.
// Add a finally clause and print a message to prove you were there.
public class ExerciseOne {
    public static void main(String[] args) {
        String s = "test";
        try {
            throw new Exception(s);
        } catch (Exception e) {
            System.out.println(s);
        } finally {
            System.out.println("In finally clause");
        }
    }
}
