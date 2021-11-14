package volume.nine;

//Exercise 1:Write a class named Outer that contains an inner class named Inner.
//Add a method to Outer that returns an object of type Inner.
// In main( ), create and initialize a reference to an Inner.
//Exercise 3:Modify Exercise 1 so that Outer has a private String field (initialized by the constructor), and Inner has a toString( ) that displays this field. Create an object of type Inner and display it.
public class Outer {
    private final String s;

    class Inner {
        Inner() {
            System.out.println("Inner class");
        }
    }

    public String toString() {
        return s;
    }

    Outer(String s) {
        this.s = s;
    }

    Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer o = new Outer("Exercise three");
        Outer.Inner i = o.getInner();
        System.out.println(i.toString());
    }
}
