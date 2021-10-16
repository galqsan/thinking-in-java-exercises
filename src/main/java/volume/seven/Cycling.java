package volume.seven;

// Exercise 1: Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
// Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.
class Cycle {
    public String toString() {
        return "Cycle";
    }
}

class Bicycle extends Cycle {
    public String toString() {
        return "Bicycle";
    }
}

class Tricycle extends Cycle {
    public String toString() {
        return "Tricycle";
    }

}

class Unicycle extends Cycle {
    public String toString() {
        return "Unicycle";
    }
}

public class Cycling {
    public static void ride(Cycle c) {
        System.out.println(c + ".ride");
    }

    public static void main(String[] args) {
        Cycle c = new Cycle();
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        ride(c);
        ride(u);
        ride(b);
        ride(t);

    }
}
