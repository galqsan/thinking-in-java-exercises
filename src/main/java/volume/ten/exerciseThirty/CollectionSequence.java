package volume.ten.exerciseThirty;

import net.mindview.typeinfo.pets.Pet;
import net.mindview.typeinfo.pets.Pets;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

//Exercise 30:Modify CollectionSequence.java so that it does not inherit from AbstractCollection, but instead implements Collection.
class InterfaceVsIterator {
    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void display(Collection<Pet> pets) {
        for (Pet p : pets)
            System.out.print(p.id() + ":" + p + " ");
        System.out.println();
    }
}

public class CollectionSequence
        implements Collection<Pet> {
    private Pet[] pets = Pets.createArray(8);

    public int size() {
        return pets.length;
    }

    @Override
    public boolean isEmpty() {
        return pets.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (o == null) return false;
        for (int i = 0; i < pets.length; i++) {
            if (o.equals(pets[i])) {
                return true;
            }
        }
        return false;
    }

    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            public boolean hasNext() {
                return index < pets.length;
            }

            public Pet next() {
                return pets[index++];
            }

            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[pets.length];
        System.arraycopy(pets, 0, result, 0, pets.length);
        return result;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < pets.length)
            a = (T[]) Array.newInstance(a.getClass().getComponentType(), pets.length);
        T[] result = a;
        System.arraycopy(pets, 0, result, 0, pets.length);
        if (result.length > pets.length)
            result[pets.length] = null;
        return result;
    }

    @Override
    public boolean add(Pet pet) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        Iterator<?> it = c.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) return false;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends Pet> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {

        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }
}
