package volume.twelve.exerciseTwelve;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Exercise 12: Modify Groups.java to count all of the unique words that do not start
//with a capital letter.
public class Groups {
    static public final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Set<String> uniqueWords = new HashSet<>();
        Matcher m = Pattern.compile("\\b([a-z]+)").matcher(POEM);

        while (m.find()) {
            uniqueWords.add(m.group());
        }
        int count = uniqueWords.size();
        System.out.println("Unique words:" + uniqueWords);
        System.out.println("Count of the unique words: " + count);
    }
}