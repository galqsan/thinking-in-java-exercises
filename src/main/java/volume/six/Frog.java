package volume.six;

//Exercise 16:Create a class called Amphibian.
// From this, inherit a class called Frog.
// Put appropriate methods in the base class.
// In main( ), create a Frog and upcast it to Amphibian and demonstrate that all the methods still work.
class Amphibian {
    void live(Amphibian a) {
        System.out.println("To live Amphibian ");
        a.eat();
    }

    void eat() {
        System.out.println("Amphibian eat");
    }

    void move() {
        System.out.println("Amphibian moving");
    }
}

public class Frog extends Amphibian {

    public static void main(String[] args) {
        Frog frog = new Frog();
        Amphibian amphibian = new Amphibian();
        amphibian.live(frog);
        amphibian.move();
        amphibian.eat();
    }
}
