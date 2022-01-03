package volume.ten.exerciseTwentyThree;

import java.util.*;

//Exercise 23:Starting with Statistics.java, create a program that runs the test repeatedly and looks to see if any one number tends to appear more than the others in the results.
class Counter {
    int c = 1;

    public String toString() {
        return Integer.toString(c);
    }
}

class Histogram implements Comparable<Histogram> {
    Integer val;
    Counter counter;

    Histogram(Integer val, Counter counter) {
        this.val = val;
        this.counter = counter;
    }

    @Override
    public int compareTo(Histogram o) {
        int lv = o.counter.c;
        int rv = counter.c;
        return lv < rv ? -1 : (lv == rv ? 1 : 0);
    }

    public String toString() {
        return "Value: " + val + " Occurrences: " + counter.c + "\n";
    }
}

public class ExerciseTwentyThree {
    public static void main(String[] args) {
        Random rand = new Random();
        Map<Integer, Counter> m =
                new HashMap<>();
        for (int i = 0; i < 1000000; i++) {
            int r = rand.nextInt(100);
            if (m.containsKey(r)) {
                m.get(r).c++;
            } else {
                m.put(r, new Counter());
            }
        }
//System.out.println(m);\
        List<Histogram> entryList = new ArrayList<>();
        Iterator<Map.Entry<Integer, Counter>> it = m.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Counter> entry = it.next();
            entryList.add(new Histogram(entry.getKey(), entry.getValue()));
        }
        Collections.sort(entryList);
        System.out.println("entryList= " + entryList);

    }
}
