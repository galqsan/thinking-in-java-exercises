package volume.seven;

//Exercise 9:Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc.
// In the base class, provide methods that are common to all Rodents, and override these in the derived classes to perform different behaviors depending on the specific type of Rodent.
//Create an array of Rodent, fill it with different specific types of Rodents, and call your base-class methods to see what happens.
//Exercise 10:Create a base class with two methods. In the first method, call the second method.
// Inherit a class and override the second method.
// Create an object of the derived class, upcast it to the base type, and call the first method.
// Explain what happens.
class Rodent {
    void eat() {
        System.out.println("Rodent.eat");
    }

    void live() {
        System.out.println("Rodent.live()");
        this.eat();
    }

    void move() {
        System.out.println("Rodent.move");
    }
}

class Mouse extends Rodent {
    @Override
    void eat() {
        System.out.println("Mouse.eat");
    }

    @Override
    void move() {
        System.out.println("Mouse.move");
    }

    public String toString() {
        return "Mouse";
    }
}

class Gerbil extends Rodent {
    @Override
    void eat() {
        System.out.println("Gerbil.eat");
    }

    @Override
    void move() {
        System.out.println("Gerbil.move");
    }
}

class Hamster extends Rodent {
    @Override
    void eat() {
        System.out.println("Hamster.eat");
    }

    @Override
    void move() {
        System.out.println("Hamster.move");
    }
}

public class Rodents {
    public static void main(String[] args) {
        Rodent rodent[] = {
                new Rodent(),
                new Hamster(),
                new Gerbil(),
                new Mouse()
        };
        for (Rodent ro : rodent) {
            ro.live();
            ro.move();
        }
        Rodent r = new Mouse();
        //it print
        //Rodent.live()
        //Mouse.eat
        r.live();

    }

}
