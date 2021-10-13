package volume.six;

//Exercise 18:Create a class with a static final field and a final field and demonstrate the difference between the two.

import java.util.Random;

public class ExerciseEighteen {
    static Random rand = new Random(50);
    static final int i1 = rand.nextInt(20);
    final int i2 = rand.nextInt(20);

    public String toString() {
        return "i1=" + i1 + " i2=" + i2;
    }

    public static void main(String[] args) {
        ExerciseEighteen eighteen1 = new ExerciseEighteen();
        ExerciseEighteen eighteen2 = new ExerciseEighteen();
        System.out.println(eighteen1);
        System.out.println(eighteen2);
    }
}
