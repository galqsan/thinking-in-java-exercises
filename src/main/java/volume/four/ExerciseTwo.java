package volume.four;

//Exercise 2:Create a class with a String field that is initialized at the point of definition, and another one that is initialized by the constructor.
// What is the difference between the two approaches?
public class ExerciseTwo {
    String st = "in class";
    String string;

    ExerciseTwo() {
        string = "in constructor";
    }

    public static void main(String[] args) {
        ExerciseTwo two= new ExerciseTwo();
        System.out.println(two.st);
        System.out.println(two.string);

    }
}
