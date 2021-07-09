package volume.four;
//Exercise 3:Create a class with a default constructor (one that takes no arguments) that prints a message.
// Create an object of this class.
//Exercise 4:Add an overloaded constructor to the previous exercise that takes a String argument and prints it along with your message.
public class ExerciseThree {
    ExerciseThree(){
        System.out.println("Constructor");
    }
    ExerciseThree(String s){
        System.out.println(s+" :Overloaded constructor ");
    }

    public static void main(String[] args) {
       new ExerciseThree();
       new ExerciseThree("Exercise four");
    }
}
