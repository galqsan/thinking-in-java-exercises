package volume.ten;

import net.mindview.util.TextFile;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

//Exercise 25:Create a Map<String,ArrayList<Integer>>. Use net.mindview.TextFile to open a text file and read it in a word at a time (use "\\W+" as the second argument to the TextFile constructor).
// Count the words as you read them in, and for each word in the file, record in the ArrayList<Integer> the word count associated with that word—this is, in effect, the location in the file where that word was found.
public class ExerciseTwentyFive {
    public static void main(String[] args) {
        String splitter = "\\W+";
        String fileName = "C:\\Repos\\ThinkingInJava\\thinking-in-java-exercises\\src\\main\\java\\volume\\ten\\ExerciseSixteen.java";
        Map<String, ArrayList<Integer>> map = new LinkedHashMap<>();
        int count = 1;
        for (String word : new TextFile(fileName, splitter)) {
            if (!map.containsKey(word)) {
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(count++);
                map.put(word, arrayList);
            } else {
                ArrayList<Integer> arrayList = map.get(word);
                arrayList.add(count++);
            }
        }
        System.out.println(map);
    }
}
