package volume.ten.exerciseTwo;

import java.util.Collection;
import java.util.HashSet;

//Exercise 2: Modify SimpleCollection.java to use a Set for c.
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<Integer>();
        for (int i = 0; i < 10; i++)
            c.add(i); // Autoboxing
        for (Integer i : c)
            System.out.print(i + ", ");
    }
}
