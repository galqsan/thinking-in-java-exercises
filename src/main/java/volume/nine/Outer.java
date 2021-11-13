package volume.nine;

//Exercise 1:Write a class named Outer that contains an inner class named Inner.
//Add a method to Outer that returns an object of type Inner.
// In main( ), create and initialize a reference to an Inner.
public class Outer {
    class Inner {
        Inner() {
            System.out.println("Inner class");
        }
    }

    Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.getInner();
    }
}
