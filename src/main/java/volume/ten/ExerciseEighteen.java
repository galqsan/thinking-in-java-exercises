package volume.ten;

import java.util.*;

//Exercise 18:Fill a HashMap with key-value pairs.
// Print the results to show ordering by hash code.
// Extract the pairs, sort by key, and place the result into a LinkedHashMap.
// Show that the insertion order is maintained.
public class ExerciseEighteen {
    public static void main(String[] args) {
        Map<String, String> linkedMap = new LinkedHashMap<>();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("5", "Five");
        hashMap.put("1", "One");
        hashMap.put("2", "Two");
        hashMap.put("4", "Four");
        hashMap.put("3", "Three");
        System.out.println("HashMap: " + hashMap);
        TreeSet<String> treeSet = new TreeSet<>(hashMap.keySet());
        Iterator<String> it = treeSet.iterator();
        while (it.hasNext()) {
            String i = it.next();
            linkedMap.put(i, hashMap.get(i));
        }
        System.out.println("LinkedHashMap: " + linkedMap);
    }
}
