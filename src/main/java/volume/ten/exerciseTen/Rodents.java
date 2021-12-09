package volume.ten.exerciseTen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//Exercise 10:Change Exercise 9 in the Polymorphism chapter to use an ArrayList to hold the Rodents and an Iterator to move through the sequence of Rodents.
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
        ArrayList<Rodent> rodent = new ArrayList<>(Arrays.asList(
                new Rodent(),
                new Hamster(),
                new Gerbil(),
                new Mouse()
        ));
        Iterator<Rodent> it = rodent.iterator();
        Rodent r;
        while (it.hasNext()) {
            r = it.next();
            r.live();
            r.move();
        }
    }

}