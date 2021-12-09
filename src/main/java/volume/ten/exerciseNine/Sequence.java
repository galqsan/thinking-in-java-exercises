package volume.ten.exerciseNine;

import java.util.Iterator;

//Exercise 9:Modify innerclasses/Sequence.java so that Sequence works with an Iterator instead of a Selector.
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

    private class SequenceIterator implements Iterator<Object> {
        private int i;

        @Override
        public boolean hasNext() {
            return i < items.length;
        }

        public Object next() {
            if (hasNext()) return items[i++];
            return items[i];
        }
    }

    public Iterator<Object> iterator() {
        return new SequenceIterator();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        Iterator<Object> it = sequence.iterator();

        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        while (it.hasNext()) {
            System.out.print(it.next() + " ");

        }
    }
}