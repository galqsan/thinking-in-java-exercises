package volume.six;

//Exercise 9: Create a class called Root that contains an instance of each of the classes (that you also create) named Component1, Component2, and Component3.
// Derive a class Stem from Root that also contains an instance of each “component.”
// All classes should have default constructors that print a message about that class.
//Exercise 10:Modify the previous exercise so that each class only has non-default constructors.
//Exercise 12: Add a proper hierarchy of dispose( ) methods to all the classes in Exercise 9.
class Root {

    Component1 component1 = new Component1('c');
    Component2 component2 = new Component2(9);
    Component3 component3 = new Component3(19f);

    Root(char a, int i) {
        System.out.println("Class Root");
    }
    void dispose(){
        System.out.println("Dispose Root");
    }
}


class Component1 {
    Component1(char a) {
        System.out.println("Class Component1");
    }
    void dispose(){
        System.out.println("Dispose Com1");
    }
}

class Component2 {
    Component2(int i) {
        System.out.println("Class Component2");
    }
    void dispose(){
        System.out.println("Dispose Com2");
    }
}

class Component3 {
    Component3(float f) {
        System.out.println("Class Component3");
    }
    void dispose(){
        System.out.println("Dispose Com3");
    }
}

public class Stem extends Root {
    Component1 c1 = new Component1('b');
    Component2 c2 = new Component2(89);
    Component3 c3 = new Component3(2f);

    Stem(boolean b) {
        super('m', 9);
        System.out.println("Class Stem");
    }
    void dispose(){
        System.out.println("Dispose Stem");
        super.dispose();
    }

    public static void main(String[] args) {
        Stem s = new Stem(true);
        s.c3.dispose();
        s.c2.dispose();
        s.c1.dispose();
        s.dispose();
    }
}
