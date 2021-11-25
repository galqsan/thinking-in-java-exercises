package volume.nine.exerciseTwentyTwo;

//Exercise 22:Implement reverseSelector( ) in Sequence.java.
interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class ReverseSelector implements Selector {
        private int i = items.length-1;

        @Override
        public boolean end() {
            return i>=0;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i >=0) i--;

        }
    }

    public Selector reverseSelector() {
        return new ReverseSelector();
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));

        Selector selector = sequence.selector();
        Selector reverseSelector = sequence.reverseSelector();
        System.out.println("Sequence ");
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.println("\nReverse sequence");
        while (reverseSelector.end()) {
            System.out.print(reverseSelector.current() + " ");
            reverseSelector.next();
       }
    }
}