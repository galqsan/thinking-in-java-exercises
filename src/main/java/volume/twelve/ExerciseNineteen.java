package volume.twelve;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Exercise 19:Building on the previous two exercises, write a program that examines
//Java source code and produces all the class names used in a particular program.
public class ExerciseNineteen {
    private static final String identifier = "[$A-Za-z_][$A-Za-z_0-9]*";
    private static final String classOrInterface = identifier + "(?:\\." + identifier + ")*";
    static final String CLASS_NAME_REGEX = "class\\s+" + identifier + "|extend\\s+" + classOrInterface + "|new\\s+" + classOrInterface;

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java file regex");
            System.exit(0);
        }
        Pattern p = Pattern.compile(CLASS_NAME_REGEX);
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
