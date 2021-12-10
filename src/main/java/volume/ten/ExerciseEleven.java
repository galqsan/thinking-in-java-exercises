package volume.ten;

import java.util.*;

//Exercise 11:Write a method that uses an Iterator to step through a Collection and print the toString( ) of each object in the container.
// Fill all the different types of Collections with objects and apply your method to each container.
public class ExerciseEleven {
    public static void display(Iterator<String> it) {
        while (it.hasNext()) {
            Object o = it.next();
            System.out.print(o.toString() + "\t ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NameGenerator nameGenerator = new NameGenerator();
        List<Collection<String>> arrayList = Arrays.asList(
                new ArrayList<String>(),
                new LinkedList<String>(),
                new HashSet<String>(),
                new TreeSet<String>());
        for (Collection<String> c : arrayList) {
            nameGenerator.fill(c);
        }
        for (Collection<String> c : arrayList) {
            display(c.iterator());

        }
    }
}
