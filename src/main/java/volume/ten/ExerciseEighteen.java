package volume.ten;

import java.util.*;

//Exercise 18:Fill a HashMap with key-value pairs.
// Print the results to show ordering by hash code.
// Extract the pairs, sort by key, and place the result into a LinkedHashMap.
// Show that the insertion order is maintained.
//Exercise 19:Repeat the previous exercise with a HashSet and LinkedHashSet.
public class ExerciseEighteen {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add( "Five");
        hashSet.add( "One");
        hashSet.add( "Two");
        hashSet.add( "Four");
        hashSet.add( "Three");
        System.out.println("HashMap: " + hashSet);
        SortedSet<String> treeSet = new TreeSet<>(hashSet);
        Set<String> linkedSet = new LinkedHashSet<>(treeSet);
        System.out.println("LinkedHashMap: " + linkedSet);
    }
}
