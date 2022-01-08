package volume.seven.exerciseTwo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shapes {
    private static RandomShapeGenerator gen =
            new RandomShapeGenerator(9);
    static List<Shape> s = new ArrayList<>();

    public static void main(String[] args) {
        Iterator<Shape> it = gen.iterator();

// Fill up the array with shapes:
        while (it.hasNext()) {
            s.add(it.next());
        }
// Make polymorphic method calls:
        for (Shape shp : s) {
            shp.draw();
            shp.reshape();
            //when it does not have override ,the print does not change
            //when the method  override only once it print different thing only for that class
        }
    }

}