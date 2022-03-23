package volume.twelve;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Exercise 10:For the phrase "Java now has regular expressions" evaluate whether the
//following expressions will find a match:^Java ,\Breg.*,n.w\s+h(a|i)s,s?,s*,s+,s{4},S{1}.,s{0,3}
public class ExerciseTen {

    public static void main(String[] args) {
        String[] match = {"^Java", "\\Breg.*", "n.w\\s+h(a|i)s ", "s?", "s*", "s+", "s{4}", "S{1}.", "s{0,3}"};
        String phase = "Java now has regular expressions";
        for (String m : match) {
            System.out.println("Expression \"" + m + "\"");
            Pattern p = Pattern.compile(m);
            Matcher matcher = p.matcher(phase);
            while (matcher.find()) {
                System.out.println("Match \"" + matcher.group() + "\" at positions " + matcher.start() + "-" + (matcher.end() - 1));
            }
        }
    }
}
