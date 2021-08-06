package volume.four;
//Exercise 15:Create a class with a String that is initialized using instance initialization.
public class ExerciseFifteen {
    String s1, s2;
    {
        s1="first instance initialization";
        s2="second instance initialization";
        System.out.println("initialization");
    }
    ExerciseFifteen(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
         new ExerciseFifteen();
    }
}
