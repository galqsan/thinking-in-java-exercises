package volume.seven;

//Exercise 11: Add class Pickle to Sandwich.java.
//Volume 8:Exercise 8:In polymorphism.Sandwich.java, create an interface called FastFood (with appropriate methods) and change Sandwich so that it also implements FastFood.
interface FastFood {
    void cook();

    void preparation();

    void plating();
}

class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Pickle {
    Pickle() {
        System.out.println("Pickle()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}

public class Sandwich extends PortableLunch implements FastFood {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();

    public void cook() {
        System.out.println("cooking()");
    }

    public void preparation() {
        System.out.println("preparation()");
    }

    public void plating() {
        System.out.println("plating()");
    }

    public Sandwich() {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args)
    { Sandwich sandwich=new Sandwich();
    sandwich.preparation();
    sandwich.cook();
    sandwich.plating();

    }
}
