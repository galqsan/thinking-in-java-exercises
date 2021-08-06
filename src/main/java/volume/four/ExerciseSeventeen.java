package volume.four;
//Exercise 17:Create a class with a constructor that takes a String argument. During construction, print the argument.
// Create an array of object references to this class, but don’t actually create objects to assign into the array.
// When you run the program, notice whether the initialization messages from the constructor calls are printed.
public class ExerciseSeventeen {
    ExerciseSeventeen(String s){
        System.out.println("String:"+s);
    }

    public static void main(String[] args) {
        ExerciseSeventeen [] seventeen  = new ExerciseSeventeen[20];
    }

}
