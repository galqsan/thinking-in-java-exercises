package volume.ten;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

//Exercise 12:Create and populate a List<Integer>. Create a second List<Integer> of the same size as the first, and use ListIterators to read elements from the first List and insert them into the second in reverse order. (You may want to explore a number of different ways to solve this problem.)
public class ExerciseTwelve {
    static Random rand = new Random();

    public static List<Integer> intFill(List<Integer> list, int p) {
        for (int i = 0; i < p; i++) {
            list.add(rand.nextInt(100));
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(5);
        List<Integer> list2 = new ArrayList<>(5);
        intFill(list1, 5);
        ListIterator<Integer> it1 = list1.listIterator();
        while (it1.hasNext()) {
            System.out.print(it1.next() + " ");
        }
        System.out.println();
        while (it1.hasPrevious()) {
            list2.add(it1.previous());
        }
        System.out.println(list2);
    }

}
