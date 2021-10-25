package volume.seven;

//Exercise 9:Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc.
// In the base class, provide methods that are common to all Rodents, and override these in the derived classes to perform different behaviors depending on the specific type of Rodent.
//Create an array of Rodent, fill it with different specific types of Rodents, and call your base-class methods to see what happens.
//Exercise 10:Create a base class with two methods. In the first method, call the second method.
// Inherit a class and override the second method.
// Create an object of the derived class, upcast it to the base type, and call the first method.
// Explain what happens.
//Exercise 12:Modify Exercise 9 so that it demonstrates the order of initialization of the base classes and derived classes.
// Now add member objects to both the base and derived classes and show the order in which their initialization occurs during construction.
class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        System.out.println("Characteristic: " + s + " ");

    }

    public String toString() {
        return "Characteristic ";
    }

}

class Description {
    private String s;

    Description(String s, Characteristic characteristic) {
        this.s = s;
        System.out.println(" Description: " + s);

    }

    public String toString() {
        return "Description ";
    }
}

class Rodent {

    Characteristic ch = new Characteristic("have long nails");
    Description de = new Description("are mammals ", ch);

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

    Rodent() {
        System.out.println("Rodent");

    }
}

class Mouse extends Rodent {
    Characteristic ch = new Characteristic("have slender tail with hair");
    Description de = new Description(" they have 20 chromosomes ", ch);

    @Override
    void eat() {
        System.out.println("Mouse.eat");
    }

    Mouse() {
        System.out.println("Mouse");
    }

    @Override
    void move() {
        System.out.println("Mouse.move");
    }
}

class Gerbil extends Rodent {
    Characteristic ch = new Characteristic("have long hind feet and fairly large ears");
    Description de = new Description(" they build extensive networks of underground tunnels ", ch);

    @Override
    void eat() {
        System.out.println("Gerbil.eat");
    }

    @Override
    void move() {
        System.out.println("Gerbil.move");
    }

    Gerbil() {
        System.out.println("Gerbil");
    }
}


class Hamster extends Rodent {
    Characteristic ch = new Characteristic("have very short tail");
    Description de = new Description(" they are kept as pets ", ch);

    @Override
    void eat() {
        System.out.println("Hamster.eat");
    }

    @Override
    void move() {
        System.out.println("Hamster.move");
    }

    Hamster() {
        System.out.println("Hamster");
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
