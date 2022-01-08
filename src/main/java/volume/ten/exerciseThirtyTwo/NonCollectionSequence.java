package volume.ten.exerciseThirtyTwo;

import net.mindview.typeinfo.pets.Pet;
import net.mindview.typeinfo.pets.Pets;
import volume.ten.exerciseThirty.*;

import java.util.*;

//Exercise 32:Following the example of MultilterableClass, add reversed( ) and randomized( ) methods to NonCollectionSequence.java, as well as making NonCollectionSequence implement Iterable, and show that all the approaches work in foreach statements.
class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence implements Iterable {
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

    public Iterable<Pet> reverse() {
        return new Iterable<Pet>() {
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    int current = pets.length - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public Pet next() {
                        return pets[current--];
                    }
                };
            }
        };
    }

    public Iterable<Pet> randomized() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                List<Pet> shuffled = new ArrayList<>(Arrays.asList(pets));
                Collections.shuffle(shuffled, new Random());
                return shuffled.iterator();
            }
        };

    }

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        InterfaceVsIterator.display(nc.iterator());
        for (Pet p : nc.reverse()) {
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
        for (Pet p : nc.randomized()) {
            System.out.print(p.id() + ":" + p + " ");
        }
    }
}