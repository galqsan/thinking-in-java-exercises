package volume.twelve.exerciseEight;

import java.util.Arrays;

//Exercise 8: Split the string Splitting.knights on the words "the" or “you."
public class ExerciseEight {
    static String s = Splitting.knights;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(s.split("the|you")));
    }
}
