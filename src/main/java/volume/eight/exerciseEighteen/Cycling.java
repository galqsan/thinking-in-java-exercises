package volume.eight.exerciseEighteen;

//Exercise 18:Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle.
// Create factories for each type of Cycle, and code that uses these factories.
interface Cycle {
    void move();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    @Override
    public void move() {
        System.out.println("Unicycle.move()");
    }
}

class UnicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle {
    @Override
    public void move() {
        System.out.println("Bicycle.move()");
    }
}

class BicycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle {
    @Override
    public void move() {
        System.out.println("Tricycle.move()");
    }
}

class TricycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}

public class Cycling {
    public static void moving(CycleFactory factory) {
        Cycle c = factory.getCycle();
        c.move();
    }

    public static void main(String[] args) {
        moving(new BicycleFactory());
        moving(new UnicycleFactory());
        moving(new TricycleFactory());
    }
}
