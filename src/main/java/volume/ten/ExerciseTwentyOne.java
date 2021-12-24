package volume.ten;

import net.mindview.util.TextFile;

import java.util.*;

//Exercise 21:Using a Map<String,Integer>, follow the form of UniqueWordsnts the occurrence of words in a file.
// Sort the results using Collections.sort( ) with a second argument of String.CASE_INSENSITIVE_ORDER (to produce an a.java to create a program that coulphabetic sort), and display the result.
public class ExerciseTwentyOne {
    public static void main(String[] args) {
        String fileName = "C:\\Repos\\ThinkingInJava\\thinking-in-java-exercises\\src\\main\\java\\volume\\ten\\ExerciseTwentyOne.java";
        String wordRegex = "\\W+";
        List<String> list = new TextFile(fileName, wordRegex);
        list.sort(String.CASE_INSENSITIVE_ORDER);
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String word : list) {
            Integer wordsCount = map.get(word);
            map.put(word, wordsCount == null ? 1 : wordsCount + 1);
        }
        System.out.println(map);

    }
}
