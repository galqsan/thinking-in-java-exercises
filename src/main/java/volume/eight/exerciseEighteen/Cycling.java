package volume.eight.exerciseEighteen;

//Exercise 18:Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle.
// Create factories for each type of Cycle, and code that uses these factories.
//Volume 9:Exercise 16:Modify the solution to Exercise 18 from the Interfaces chapter to use anonymous inner classes.
interface Cycle {
    void move();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    private Unicycle() {
    }

    @Override
    public void move() {
        System.out.println("Unicycle.move()");
    }

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Unicycle();
        }
    };
}

class Bicycle implements Cycle {
    private Bicycle() {
    }

    @Override
    public void move() {
        System.out.println("Bicycle.move()");
    }

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Bicycle();
        }
    };
}

class Tricycle implements Cycle {
    private Tricycle() {
    }

    @Override
    public void move() {
        System.out.println("Tricycle.move()");
    }

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Tricycle();
        }
    };
}

public class Cycling {
    public static void moving(CycleFactory factory) {
        Cycle c = factory.getCycle();
        c.move();
    }

    public static void main(String[] args) {
        moving(Bicycle.factory);
        moving(Unicycle.factory);
        moving(Tricycle.factory);
    }
}
