package volume.ten;

import java.util.LinkedList;
import java.util.ListIterator;

//Exercise 14:Create an empty LinkedList<Integer>.
// Using a Listlterator, add Integers to the List by always inserting them in the middle of the List.
public class ExerciseFourteen {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ListIterator<Integer> li;
        for (int i = 1; i <= 10; i++) {
            li = linkedList.listIterator(linkedList.size() / 2);
            li.add(i);
        }
        System.out.println(linkedList);
    }
}

