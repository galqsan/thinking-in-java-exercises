package volume.ten.exerciseFive;

import java.util.*;

//Exercise 5:Modify ListFeatures.java so that it uses Integers (remember autoboxing!) instead of Pets, and explain any difference in results.
public class ListFeatures {
    static Random rand = new Random();
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();

    ArrayList intFill(int p) {
        for (int i = 0; i < p; i++) {
            arrayList.add(rand.nextInt(100));
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ListFeatures listFeatures = new ListFeatures();

        List<Integer> nums = listFeatures.intFill(7);
        System.out.println("1: " + nums);
        Integer h = new Integer(8);
        nums.add(h); // Automatically resizes
        System.out.println("2: " + nums);
        System.out.println("3: " + nums.contains(h));
        nums.remove(h); // Remove by object
        Integer p = nums.get(2);
        System.out.println("4: " + p + " " + nums.indexOf(p));
        nums.add(0, 5);
        Integer cymric = new Integer(5);
        System.out.println("5: " + nums.indexOf(cymric));
        System.out.println("6: " + nums.remove(cymric));
// Integers are equal if the contents of two Integers are identical
        System.out.println("7: " + nums.remove(p));
        System.out.println("8: " + nums);
        nums.add(3, new Integer(11)); // Insert at an index
        System.out.println("9: " + nums);
        List<Integer> sub = nums.subList(1, 4);
        System.out.println("subList: " + sub);
        System.out.println("10: " + nums.containsAll(sub));
        Collections.sort(sub); // In-place sort
        System.out.println("sorted subList: " + sub);
// Order is not important in containsAll():
        System.out.println("11: " + nums.containsAll(sub));
        Collections.shuffle(sub, rand); // Mix it up
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + nums.containsAll(sub));
        List<Integer> copy = new ArrayList<Integer>(nums);
        sub = Arrays.asList(nums.get(1), nums.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<Integer>(nums); // Get a fresh copy
        copy.remove(2); // Remove by index
        System.out.println("14: " + copy);
        copy.removeAll(sub); // Only removes exact objects
        System.out.println("15: " + copy);
        copy.set(1, new Integer(100)); // Replace an element
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
