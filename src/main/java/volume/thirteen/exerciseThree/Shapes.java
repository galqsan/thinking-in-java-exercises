package volume.thirteen.exerciseThree;

import java.util.Arrays;
import java.util.List;

/*Exercise 3: Add Rhomboid to Shapes.java. Create a Rhomboid, upcast it to a
Shape, then downcast it back to a Rhomboid. Try down casting to a Circle and see what
happens.*/
abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
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
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );
        for (Shape shape : shapeList)
            shape.draw();
        Shape s = new Rhomboid();
        s.draw();
        Rhomboid r = (Rhomboid) s;
        r.draw();
        //Circle c = (Circle) s;
        //Fails at runtime with a ClassCastException
    }
}