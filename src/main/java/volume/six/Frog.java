package volume.six;

//Exercise 16:Create a class called Amphibian.
// From this, inherit a class called Frog.
// Put appropriate methods in the base class.
// In main( ), create a Frog and upcast it to Amphibian and demonstrate that all the methods still work.
//Exercise 17: Modify Exercise 16 so that Frog overrides the method definitions from the base class (provides new definitions using the same method signatures).
// Note what happens in main( ).
class Amphibian {
    void live(Amphibian a) {
        System.out.println("To live Amphibian ");
        a.eat();
        a.move();
    }

    void eat() {
        System.out.println("Amphibian eat");
    }

    void move() {
        System.out.println("Amphibian moving");
    }
}

public class Frog extends Amphibian {
    @Override
    void move() {
        System.out.println("Frog jump");
    }

    @Override
    void live(Amphibian a) {
        System.out.println("To live Frog");
        a.eat();
        a.move();
    }

    @Override
    void eat() {
        System.out.println("Frog eat");
    }


    public static void main(String[] args) {
        Frog frog = new Frog();
        Amphibian amphibian = new Amphibian();
        frog.move();
        frog.eat();
        frog.live(frog);
        amphibian.live(frog);

    }
}
