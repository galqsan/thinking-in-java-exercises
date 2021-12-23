package volume.ten;

import net.mindview.util.TextFile;

import java.util.*;

//Exercise 16:Create a Set of the vowels.
// Working from UniqueWords.Java, count and display the number of vowels in each input word, and also display the total number of vowels in the input file.
//Exercise 20:Modify Exercise 16 so that you keep a count of the occurrence of each vowel.
public class ExerciseSixteen {
    private static Set<Character> characterSet = new HashSet<>(Arrays.asList('a', 'e', 'o', 'u',
            'i', 'A', 'E', 'O', 'U', 'I'));

    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        Integer countVowels;
        int countFile = 0;
        String fileName = "C:\\Repos\\ThinkingInJava\\thinking-in-java-exercises\\src\\main\\java\\volume\\ten\\ExerciseSixteen.java";
        String splitter = "\\W+";
        for (String w : new TextFile(fileName, splitter)) {
            int countWord = 0;
            for (char c : w.toCharArray()) {
                if (characterSet.contains(c)) {
                    countVowels = map.get(c);
                    map.put(c, countVowels == null ? 1 : countVowels + 1);
                    countWord++;
                }
                if (!words.contains(w)) {
                    words.add(w);
                    System.out.println(w + " has " + countWord + " vowels");
                }
                countFile += countWord;
            }
        }
        System.out.println(map);
        System.out.println("file vowels " + countFile);
    }
}
