package volume.twelve;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Exercise 11:Apply the regular expression
//(?i)((^[aeiou])|(\s+[aeiou]))\w+?[aeiou]\b to "Arline ate eight apples and one orange while Anita hadn’t any"
public class ExerciseEleven {
    public static void main(String[] args) {
        String match = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
        String phase = "Arline ate eight apples and one orange while Anita hadn’t any";
        System.out.println("Expression \"" + match + "\"");
        Pattern p = Pattern.compile(match);
        Matcher matcher = p.matcher(phase);
        while (matcher.find()) {
            System.out.println("Match \"" + matcher.group() + "\" at positions " + matcher.start() + "-" + (matcher.end() - 1));
        }

    }
}
