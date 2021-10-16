package volume.seven.exerciseTwo;

public class Shapes {
    private static RandomShapeGenerator gen =
            new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
// Fill up the array with shapes:
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
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