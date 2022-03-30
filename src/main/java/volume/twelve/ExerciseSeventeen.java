package volume.twelve;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Exercise 17: Write a program that reads a Java source-code file (you provide the file
//name on the command line) and displays all the comments.
public class ExerciseSeventeen {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java file regex");
            System.exit(0);
        }
        Pattern p = Pattern.compile("(?x)(?m)(?s)/\\*(.*?)\\*/|//(.*?)$");
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
