package volume.eight.exerciseFourteen;

//Exercise 14:Create three interfaces, each with two methods.
// Inherit a new interface that combines the three, adding a new method.
// Create a class by implementing the new interface and also inheriting from a concrete class.
// Now write four methods, each of which takes one of the four interfaces as an argument.
// In main( ), create an object of your class and pass it to each of the methods.
//Exercise 15:Modify the previous exercise by creating an abstract class and inheriting that into the derived class.
interface Monster {
    void menace();

    void terror();

}

interface Dangerous {
    void destroy();

    void deform();
}

interface Lethal {
    void kill();

    void mutate();

}

interface Vampire extends Monster, Lethal, Dangerous {
    void drinkBlood();
}

class BadMonster {
    String s;

    void s(String s) {
        this.s = s;
        System.out.println(s);
    }
}

class DangerousVampire extends BadMonster implements Vampire {

    @Override
    public void menace() {
        System.out.println("menace()");
    }

    @Override
    public void terror() {
        System.out.println("terror()");
    }

    @Override
    public void destroy() {
        System.out.println("destroy()");
    }

    @Override
    public void deform() {
        System.out.println("deform()");
    }

    @Override
    public void kill() {
        System.out.println("kill()");
    }

    @Override
    public void mutate() {
        System.out.println("mutate()");
    }

    @Override
    public void drinkBlood() {
        System.out.println("drinkBlood()");
    }
}

abstract class Show {
    abstract void h();
}

public class HorrorShow extends Show {
    void h() {
        System.out.println("h()");
    }

    static void v(Monster x) {
        x.menace();
        x.terror();
    }

    static void f(Dangerous x) {
        x.deform();
        x.destroy();
    }

    static void u(Lethal x) {
        x.kill();
        x.mutate();
    }

    static void m(Vampire x) {
        x.drinkBlood();
    }

    public static void main(String[] args) {
        Vampire vampire = new DangerousVampire();
        u(vampire);
        m(vampire);
        v(vampire);
        f(vampire);

    }
}
