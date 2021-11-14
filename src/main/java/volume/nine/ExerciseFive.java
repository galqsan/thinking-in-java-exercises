package volume.nine;

//Exercise 5: Create a class with an inner class.
// In a separate class, make an instance of the inner class.
class Outer5 {
    class Inner5 {
        {
            System.out.println("Inner class");
        }
    }
}

public class ExerciseFive {
    public static void main(String[] args) {
        Outer5 outer = new Outer5();
        Outer5.Inner5 inner = outer.new Inner5();
    }
}
