package volume.ten;

import java.util.*;

//Exercise 4:Create a generator class that produces character names (as String objects) from your favorite movie (you can use Snow White or Star Wars as a fallback) each time you call next( ), and loops around to the beginning of the character list when it runs out of names.
// Use this generator to fill an array, an ArrayList, a LinkedList, a HashSet, a LinkedHashSet, and a TreeSet, then print each container.
class NameGenerator {
    String[] strArray = {"Game of Thrones", "Geostorm", "The 100", "John Wick", "Tomb Raider", "Spider-man"};
    private int n;

    public String next() {
        String s;
        s = strArray[n];
        n = (n + 1) % strArray.length;
        return s;
    }

    String[] fill(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = this.next();
        }
        return array;
    }

    Collection<String> fill(Collection<String> collection) {
        for (int i = 0; i < 6; i++) {
            collection.add(this.next());
        }
        return collection;
    }
}

public class ExerciseFour {
    private static NameGenerator generator = new NameGenerator();

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generator.fill(new String[6])));
        System.out.println(generator.fill(new ArrayList()));
        System.out.println(generator.fill(new LinkedList()));
        System.out.println(generator.fill(new HashSet()));
        System.out.println(generator.fill(new LinkedHashSet()));
        System.out.println(generator.fill(new TreeSet()));
    }
}
