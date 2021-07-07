package volume.four;
//Exercise 1:Create a class containing an uninitialized String reference.
// Demonstrate that this reference is initialized by Java to null.
public class ExerciseOne {
     String st;
    public static void main(String[] args) {
        ExerciseOne one =new ExerciseOne();

        System.out.println(one.st);
    }
}
