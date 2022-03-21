package volume.twelve;

import volume.twelve.exerciseEight.Splitting;

import java.util.regex.Pattern;

//Exercise 9:Using the documentation for java.util.regex.Pattern as a resource,
//replace all the vowels in Splitting.knights with underscores.
public class ExerciseNine {
    Pattern vowels = Pattern.compile("[aeiouAEIOU]");

    public static void main(String[] args) {
        ExerciseNine nine = new ExerciseNine();
        System.out.println(nine.replaceVowels(Splitting.knights));
    }

    public String replaceVowels(String s) {
        return vowels.matcher(s).replaceAll("_");
    }
}
