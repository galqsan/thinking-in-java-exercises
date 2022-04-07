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
abstract class Shape {
    boolean highlight = false;

    void draw() {
        System.out.println(this + ".draw()");
    }
    public abstract String toString();
}

class Circle extends Shape {

    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {

    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {

    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape {

    public String toString() {
        return "Rhomboid";
    }
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
        for (Shape shape : shapeList) {
            shape.draw();
            rotate(shape);
        }

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