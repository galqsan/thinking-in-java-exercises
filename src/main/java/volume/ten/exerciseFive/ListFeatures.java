package volume.ten.exerciseFive;

import java.util.*;

//Exercise 5:Modify ListFeatures.java so that it uses Integers (remember autoboxing!) instead of Pets, and explain any difference in results.
//Exercise 6:Modify ListFeatures.java so that it uses Strings instead of Pets, and explain any difference in results.
public class ListFeatures {
    private static Random rand = new Random();
    private ArrayList<String> arrayList = new ArrayList<>();

    private ArrayList<String> intFill(int p) {
        for (int i = 0; i < p; i++) {
            arrayList.add(Integer.toString(rand.nextInt(100)));
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ListFeatures listFeatures = new ListFeatures();

        List<String> nums = listFeatures.intFill(7);
        System.out.println("1: " + nums);
        String h = "hamster";
        nums.add(h); // Automatically resizes
        System.out.println("2: " + nums);
        System.out.println("3: " + nums.contains(h));
        nums.remove(h); // Remove by object
        String p = nums.get(2);
        System.out.println("4: " + p + " " + nums.indexOf(p));
        nums.add(0, "cymric");
        String cymric = "cymric";
        System.out.println("5: " + nums.indexOf(cymric));
        System.out.println("6: " + nums.remove(cymric));
// Strings are equal if the contents of two Strings are identical
        System.out.println("7: " + nums.remove(p));
        System.out.println("8: " + nums);
        nums.add(3, "ni"); // Insert at an index
        System.out.println("9: " + nums);
        List<String> sub = nums.subList(1, 4);
        System.out.println("subList: " + sub);
        System.out.println("10: " + nums.containsAll(sub));
        Collections.sort(sub); // In-place sort
        System.out.println("sorted subList: " + sub);
// Order is not important in containsAll():
        System.out.println("11: " + nums.containsAll(sub));
        Collections.shuffle(sub, rand); // Mix it up
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + nums.containsAll(sub));
        List<String> copy = new ArrayList<>(nums);
        sub = Arrays.asList(nums.get(1), nums.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<>(nums); // Get a fresh copy
        copy.remove(2); // Remove by index
        System.out.println("14: " + copy);
        copy.removeAll(sub); // Only removes exact objects
        System.out.println("15: " + copy);
        copy.set(1, "100"); // Replace an element
        System.out.println("16: " + copy);
        copy.addAll(2, sub); // Insert a list in the middle
        System.out.println("17: " + copy);
        System.out.println("18: " + nums.isEmpty());
        nums.clear(); // Remove all elements
        System.out.println("19: " + nums);
        System.out.println("20: " + nums.isEmpty());
        nums.addAll(listFeatures.intFill(4));
        System.out.println("21: " + nums);
        Object[] o = nums.toArray();
        System.out.println("22: " + o[3]);
    }
}
