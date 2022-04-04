package volume.twelve.exerciseFifteen;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//{Args: JGrep.java "\\b[Ssct]\\w+"}
//Exercise 15: Modify JGrep.java to accept flags as arguments (e.g.,
//Pattern.CASE_INSENSITIVE, Pattern.MULTILINE).
public class JGrep {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        Pattern p = Pattern.compile(args[1], Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        // Iterate through the lines of the input file:
        int index = 0;
        Matcher m = p.matcher("");
        for (String line : new TextFile(args[0])) {
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " +
                        m.group() + ": " + m.start());
        }
    }
}
