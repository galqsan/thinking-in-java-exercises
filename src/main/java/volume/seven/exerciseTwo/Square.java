package volume.seven.exerciseTwo;

public class Square extends Shape {
    @Override
    public void draw() {

        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }

    @Override
    public void reshape() {
        System.out.println("Square.reshape");
    }
}
