package volume.seven;

// Exercise 1: Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
// Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.
//Exercise 5: Starting from Exercise 1, add a wheels( ) method in Cycle, which returns the number of wheels.
// Modify ride( ) to call wheels( ) and verify that polymorphism works.
class Cycle {
    public String toString() {
        return "Cycle";
    }

    public int wheels() {
        return 0;
    }
}

class Bicycle extends Cycle {
    public String toString() {
        return "Bicycle";
    }

    @Override
    public int wheels() {
        return 2;
    }
}

class Tricycle extends Cycle {
    public String toString() {
        return "Tricycle";
    }

    @Override
    public int wheels() {
        return 3;
    }

}

class Unicycle extends Cycle {
    public String toString() {
        return "Unicycle";
    }

    @Override
    public int wheels() {
        return 1;
    }
}

public class Cycling {
    public static void ride(Cycle c) {
        int i;
        System.out.println(c + ".ride ");
        i = c.wheels();
        System.out.println("wheels " + i);
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
