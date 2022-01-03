package volume.ten;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//Exercise 24: Fill a LinkedHashMap with String keys and objects of your choice.
// Now extract the pairs, sort them based on the keys, and reinsert them into the Map.
public class ExerciseTwentyFour {

    public static void main(String[] args) {
        Map<String, Integer> m = new TreeMap<>();
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);
        linkedHashMap.put("Four", 4);
        System.out.println("linkedHashMap: "+linkedHashMap);
        Iterator<Map.Entry<String, Integer>> it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            m.put(entry.getKey(), entry.getValue());
        }
        System.out.println("Map: "+m);

    }
}
