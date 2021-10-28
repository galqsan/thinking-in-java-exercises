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
//Exercise 14:Modify Exercise 12 so that one of the member objects is a shared object with reference counting, and demonstrate that it works properly.
//Volume 8:Exercise 7:Change Exercise 9 in the Polymorphism chapter so that Rodent is an interface.
class Characteristic {
    private String s;

    private static long counter = 0;
    private final long id = counter++;
    private int refcount = 0;

    Characteristic(String s) {
        this.s = s;
        System.out.println("Characteristic: " + s + " " + id);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            System.out.println("dispose " + this);
        }
    }

    public String toString() {
        return "Characteristic " + id;
    }


}

class Description {
    private String s;
    Characteristic characteristic;
    private static long counter = 0;
    private final long id = counter++;

    Description(String s, Characteristic characteristic) {
        this.s = s;
        System.out.println(" Description: " + s + " " + id);
        this.characteristic = characteristic;
        this.characteristic.addRef();
    }

    protected void dispose() {
        System.out.println("dispose " + this);
        characteristic.dispose();
    }

    public String toString() {
        return "Description " + id;
    }
}

interface Rodent {
    Characteristic ch = new Characteristic("have long nails");
    Description de = new Description("are mammals ", ch);

    void eat();

    void move();

    void live();

}

class Mouse implements Rodent {
    Characteristic ch = new Characteristic("have slender tail with hair");
    Description de = new Description(" they have 20 chromosomes ", ch);

    public void eat() {
        System.out.println("Mouse.eat");
    }

    Mouse() {
        System.out.println("Mouse");
    }

    public void move() {
        System.out.println("Mouse.move");
    }

    public void live() {
        System.out.println("Mouse.live()");
        this.eat();
    }
}

class Gerbil implements Rodent {
    Characteristic ch = new Characteristic("have long hind feet and fairly large ears");
    Description de = new Description(" they build extensive networks of underground tunnels ", ch);

    public void eat() {
        System.out.println("Gerbil.eat");
    }

    @Override
    public void move() {
        System.out.println("Gerbil.move");
    }

    Gerbil() {
        System.out.println("Gerbil");
    }

    public void live() {
        System.out.println("Gerbil.live()");
        this.eat();
    }
}


class Hamster implements Rodent {
    Characteristic ch = new Characteristic("have very short tail");
    Description de = new Description(" they are kept as pets ", ch);


    public void eat() {
        System.out.println("Hamster.eat");
    }


    public void move() {
        System.out.println("Hamster.move");
    }

    Hamster() {
        System.out.println("Hamster");
    }

    public void live() {
        System.out.println("Hamster.live()");
        this.eat();
    }
}

public class Rodents {
    public static void main(String[] args) {
        Rodent rodent[] = {
                new Hamster(),
                new Gerbil(),
                new Mouse()
        };
        for (Rodent ro : rodent) {
            ro.live();
            ro.move();
            ro.de.dispose();

        }
        Rodent r = new Mouse();
        //it print
        //Rodent.live()
        //Mouse.eat
        r.live();

    }

}
