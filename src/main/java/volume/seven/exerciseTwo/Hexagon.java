package volume.seven.exerciseTwo;

//Exercise 4:Add a new type of Shape to Shapes.java and verify in main( ) that polymorphism works for your new type as it does in the old types.
public class Hexagon extends Shape {
    @Override
    public void draw() {
        System.out.println("Hexagon.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Hexagon.erase()");
    }

    @Override
    public void reshape() {
        System.out.println("Hexagon.reshape");
    }
}
