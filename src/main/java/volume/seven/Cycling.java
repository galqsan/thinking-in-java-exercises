package volume.seven;

// Exercise 1: Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
// Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.
//Exercise 5: Starting from Exercise 1, add a wheels( ) method in Cycle, which returns the number of wheels.
// Modify ride( ) to call wheels( ) and verify that polymorphism works.
//Exercise 17:Using the Cycle hierarchy from Exercise 1, add a balance( ) method to Unicycle and Bicycle, but not to Tricycle.
// Create instances of all three types and upcast them to an array of Cycle.
// Try to call balance( ) on each element of the array and observe the results.
// Downcast and call balance( ) and observe what happens.
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

    public void balance() {
        System.out.println("balance");
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

    public void balance() {
        System.out.println("balance");
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
        Cycle c[] = {
                new Cycle(),
                new Unicycle(),
                new Bicycle(),
                new Tricycle()};

        for (Cycle cycle : c) {
            ride(cycle);

        }
        //method not found in Cycle:
        //c[1].balance();
        //c[2].balance();
        //c[3].balance();
        ((Unicycle) c[1]).balance();
        ((Bicycle) c[2]).balance();


    }
}
