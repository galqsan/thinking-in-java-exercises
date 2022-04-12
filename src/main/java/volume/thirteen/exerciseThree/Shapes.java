package volume.thirteen.exerciseThree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Exercise 3: Add Rhomboid to Shapes.java. Create a Rhomboid, upcast it to a
Shape, then downcast it back to a Rhomboid. Try down casting to a Circle and see what
happens.*/
/*Exercise 4: Modify the previous exercise so that it uses instanceof to check the type
before performing the downcast. */
/*Exercise 5:Implement a rotate(Shape) method in Shapes.java, such that it
checks to see if it is rotating a Circle (and, if so, doesn't perform the operation).*/
/*Exercise 6: Modify Shapes.java so that it can "highlight" (set a flag in) all shapes of
a particular type. The toString( ) method for each derived Shape should indicate whether
that Shape is "highlighted." */
abstract class Shape {
    boolean highlight = false;

    void draw() {
        System.out.println(this + ".draw()");
    }

    public String toString() {
        return getClass().getName() + (highlight ? " Highlighted" : " Normal");
    }

    static List<Shape> shapes = new ArrayList<>();

    Shape() {
        shapes.add(this);
    }

    static void highlighting(Class<?> type) {
        for (Shape shape : shapes) {
            if (type.isInstance(shape)) {
                shape.highlight = true;
            }
        }
    }

    static void clearHighlight(Class<?> type) {
        for (Shape shape : shapes) {
            if (type.isInstance(shape)) {
                shape.highlight = false;
            }
        }
    }

}

class Circle extends Shape {
}

class Square extends Shape {
}

class Triangle extends Shape {
}

class Rhomboid extends Shape {
}

public class Shapes {
    static void rotate(Shape s) {
        if (!(s instanceof Circle)) {
            System.out.println("rotate " + s);
        }
    }

    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );
        Shape.highlighting(Rhomboid.class);
        for (Shape shape : shapeList) {
            shape.draw();
            rotate(shape);
        }
        Shape.clearHighlight(Rhomboid.class);
        //checking whether the Rhomboid is still highlighted
        shapeList.get(3).draw();

        Shape s = new Rhomboid();
        s.draw();
        Rhomboid r = (Rhomboid) s;
        r.draw();
        if (s instanceof Circle) {
            Circle c = (Circle) s;
            c.draw();
        } else {
            System.out.println(" s is not a Circle");
        }

    }
}