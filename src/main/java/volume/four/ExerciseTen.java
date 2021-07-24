package volume.four;
//Exercise 10:Create a class with a finalize( ) method that prints a message.
// In main( ), create an object of your class. Explain the behavior of your program.
public class ExerciseTen {
    protected void finalize(){
        System.out.println("finalize metod");
    }

    public static void main(String[] args) {
        ExerciseTen ten = new ExerciseTen();
    }

}
