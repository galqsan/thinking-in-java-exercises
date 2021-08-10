package volume.four;
//Exercise 19: Write a method that takes a vararg String array.
// Verify that you can pass either a comma-separated list of Strings or a String[] into this method.
public class ExerciseNineteen {
    static void printVarargsArray(String... s){
        for (String st:s) {
            System.out.print(" "+st);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printVarargsArray("5",new String("6 7"),"8");
        printVarargsArray(new String[]{"ONE","TWO"});
    }
}
