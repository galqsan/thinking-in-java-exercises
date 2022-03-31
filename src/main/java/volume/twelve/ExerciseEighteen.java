package volume.twelve;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Exercise 18: Write a program that reads a Java source-code file (you provide the file
//name on the command line) and displays all the string literals in the code.
public class ExerciseEighteen {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java file regex");
            System.exit(0);
        }
        Pattern p = Pattern.compile("\"(?:[^\"\\\\\\n\\r]|(?:\\\\(?:[untbrf\\\\'\"]|[0-9A-Fa-f]{4}|[0-7]{1,2}|[0-3][0-7]{2})))*\\\"");
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
