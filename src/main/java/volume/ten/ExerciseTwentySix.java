package volume.ten;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

//Exercise 26: Take the resulting Map from the previous exercise and re-create the order of the words as they appeared in the original file.
public class ExerciseTwentySix {

    public static void main(String[] args) {
        String fileName = "C:\\Repos\\ThinkingInJava\\thinking-in-java-exercises\\src\\main\\java\\volume\\ten\\ExerciseSixteen.java";
        Map<String, ArrayList<Integer>> map = ExerciseTwentyFive.getWordMapFromFileName(fileName);
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<Map.Entry<String, ArrayList<Integer>>> it = map.entrySet().iterator();

        for (int wordPosition = 1; ; wordPosition++) {
            boolean fount = false;
            for (String word : map.keySet()) {
                if (map.get(word).contains(wordPosition)) {
                    arrayList.add(word);
                    fount = true;
                    break;
                }
            }
            if (!fount) {
                break;
            }
        }
        System.out.println(arrayList);
    }
}
