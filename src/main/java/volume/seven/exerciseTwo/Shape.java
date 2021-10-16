package volume.seven.exerciseTwo;

//Exercise 2: Add the @Override annotation to the shapes example.
//Exercise 3: Add a new method in the base class of Shapes.java that prints a message, but don’t override it in the derived classes.
//Explain what happens. Now override it in one of the derived classes but not the others, and see what happens.
//Finally, override it in all the derived classes.
public class Shape {
    public void draw() {
    }

    public void erase() {
    }

    public void reshape() {
        System.out.println("Shape.reshape ");
    }
}