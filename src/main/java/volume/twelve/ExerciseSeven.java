package volume.twelve;

import java.util.regex.Pattern;

//Exercise 7: Using the documentation for java.util.regex.Pattern as a resource,
//write and test a regular expression that checks a sentence to see that it begins with a capital
//letter and ends with a period.
public class ExerciseSeven {
    Pattern upperCase = Pattern.compile("^[A-Z].*");
    Pattern period = Pattern.compile(".*[.].*$");

    public static void main(String[] args) {
        String text = "Start with upper case and end with period.";
        ExerciseSeven seven = new ExerciseSeven();
        System.out.println(seven.checkingTheFirstAndLastChar(text));
    }

    public boolean checkingTheFirstAndLastChar(String text) {
        return upperCase.matcher(text).matches() && period.matcher(text).matches();
    }
}
