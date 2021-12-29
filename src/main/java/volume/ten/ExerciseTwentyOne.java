package volume.ten;

import net.mindview.util.TextFile;

import java.util.*;

//Exercise 21:Using a Map<String,Integer>, follow the form of UniqueWordsnts the occurrence of words in a file.
// Sort the results using Collections.sort( ) with a second argument of String.CASE_INSENSITIVE_ORDER (to produce an a.java to create a program that coulphabetic sort), and display the result.
//Exercise 22:Modify the previous exercise so that it uses a class containing a String and a count field to store each different word, and a Set of these objects to maintain the list of words.
class UniqueWord {
    String word;
    int count;

    UniqueWord(String word) {
        this.word = word;
        count = 1;
    }

    public void counter() {
        count++;
    }

    @Override
    public String toString() {
        return "{" +
                "word='" + word + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniqueWord that = (UniqueWord) o;
        return Objects.equals(word, that.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word);
    }
}

public class ExerciseTwentyOne {
    public static void main(String[] args) {

        String fileName = "C:\\Repos\\ThinkingInJava\\thinking-in-java-exercises\\src\\main\\java\\volume\\ten\\ExerciseTwentyOne.java";
        String wordRegex = "\\W+";
        List<String> list = new TextFile(fileName, wordRegex);
        list.sort(String.CASE_INSENSITIVE_ORDER);
        Set<UniqueWord> uniqueWordSet = new HashSet<>();

        for (String word : list) {
            UniqueWord uniqueWord = new UniqueWord(word);
            if (uniqueWordSet.contains(uniqueWord)) {
                for (UniqueWord currentItem : uniqueWordSet) {
                    if (currentItem.equals(uniqueWord)) {
                        currentItem.counter();
                    }
                }
            } else {
                uniqueWordSet.add(uniqueWord);
            }
        }
        System.out.println(uniqueWordSet.toString());

    }
}
