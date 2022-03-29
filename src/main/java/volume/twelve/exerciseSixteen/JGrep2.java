package volume.twelve.exerciseSixteen;

import net.mindview.util.TextFile;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Exercise 16:  Modify JGrep.java to accept a directory name or a file name as
//argument (if a directory is provided, search should include all files in the directory). Hint:
//You can generate a list of file names with:
//File[] files = new File(".").listFiles();
public class JGrep2 {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep2 file regex");
            System.exit(0);
        }
        File file = new File(args[0]);
        File[] files = null;
        if (file.isDirectory()) {
            files = file.listFiles();
        } else {
            files = new File[]{new File(args[0])};
        }
        for (File f : files) {
            System.out.println("File:" + f.getName());
            Pattern p = Pattern.compile(args[1]);
            // Iterate through the lines of the input file:
            int index = 0;
            Matcher m = p.matcher("");
            for (String line : new TextFile(f.getAbsolutePath())) {
                m.reset(line);
                while (m.find())
                    System.out.println(index++ + ": " +
                            m.group() + ": " + m.start());
            }
        }
    }
}