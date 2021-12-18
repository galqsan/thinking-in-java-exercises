package volume.ten;

import net.mindview.util.TextFile;

import java.util.*;

//Exercise 16:Create a Set of the vowels.
// Working from UniqueWords.Java, count and display the number of vowels in each input word, and also display the total number of vowels in the input file.
public class ExerciseSixteen {
    private static Set<Character> characterSet = new HashSet<>(Arrays.asList('a', 'e', 'o', 'u',
            'i', 'A', 'E', 'O', 'U', 'I'));

    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        int countWord;
        int countFile = 0;
        for (String w : new TextFile("C:\\Repos\\ThinkingInJava\\thinking-in-java-exercises\\src\\main\\java\\volume\\ten\\ExerciseSixteen.java", "\\W+")) {
            countWord = 0;
            for (char c : w.toCharArray()) {
                if (characterSet.contains(c)) {
                    countWord++;
                }
                if (!words.contains(w)) {
                    words.add(w);
                    System.out.println(w + " has " + countWord + " vowels");
                }
                countFile += countWord;
            }
        }
        System.out.println("file vowels " + countFile);
    }
}
