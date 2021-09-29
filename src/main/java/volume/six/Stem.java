package volume.six;

//Exercise 9: Create a class called Root that contains an instance of each of the classes (that you also create) named Component1, Component2, and Component3.
// Derive a class Stem from Root that also contains an instance of each “component.”
// All classes should have default constructors that print a message about that class.
class Root {

    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();

    Root() {
        System.out.println("Class Root");
    }
}

class Component1 {
    Component1() {
        System.out.println("Class Component1");
    }
}

class Component2 {
    Component2() {
        System.out.println("Class Component2");
    }
}

class Component3 {
    Component3() {
        System.out.println("Class Component3");
    }
}

public class Stem extends Root {
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();

    Stem() {
        System.out.println("Class Stem");
    }

    public static void main(String[] args) {
        Stem s = new Stem();
    }
}
