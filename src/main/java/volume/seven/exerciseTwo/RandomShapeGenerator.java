package volume.seven.exerciseTwo;

import java.util.Iterator;
import java.util.Random;

//Volume 10: Exercise 31:Modify polymorphism/shape/RandomShapeGenerator.java to make it Iterable.
// You’ll need to add a constructor that takes the number of elements that you want the iterator to produce before stopping.
// Verify that it works.
public class RandomShapeGenerator implements Iterable<Shape> {
    private Random rand = new Random();
    int numberOfElements;

    RandomShapeGenerator(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < numberOfElements;
            }

            @Override
            public Shape next() {
                index++;
                switch (rand.nextInt(5)) {
                    default:
                    case 0:
                        return new Circle();
                    case 1:
                        return new Square();
                    case 2:
                        return new Triangle();
                    case 3:
                        return new Hexagon();
                }
            }
        };
    }
}
