package volume.one;
//Write a program that demonstrates that, no matter how many objects you create of a particular class, there is only one instance of a particular static field in that class.
public class ExerciseEight {
    static double db = 2.5;

    public static void main(String[] args) {

        ExerciseEight ex = new ExerciseEight();
        ExerciseEight ex2 = new ExerciseEight();
       ex.db++;
        System.out.println(ex2.db);

    }
}
