package volume.nine;

//Exercise 2: Create a class that holds a String, and has a toString( ) method that displays this String.
// Add several instances of your new class to a Sequence object, then display them.
//Exercise 4:Add a method to the class Sequence.SequenceSelector that produces the reference to the outer class Sequence.
interface Selector {
    boolean end();

    Object current();

    void next();
}

class Extwo {
    private String s;

    Extwo(String s) {
        this.s = s;
    }

    public String toString() {
        return s;
    }
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

    private class SequenceSelector implements Selector {
        private int i = 0;

        public Sequence getSequence() {
            return Sequence.this;
        }

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
        sequence.add(new Extwo("Exercise two"));
        for (int i = 1; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}