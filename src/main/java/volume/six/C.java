package volume.six;

//Exercise 5: Create two classes, A and B, with default constructors (empty argument lists) that announce themselves. Inherit a new class called C from A, and create a member of class B inside C.
// Do not create a constructor for C. Create an object of class C and observe the results.
//Exercise 7: Modify Exercise 5 so that A and B have constructors with arguments instead of default constructors.
// Write a constructor for C and perform all initialization within C’s constructor.
class A {
    A(int i) {
        System.out.println(" Class A ");
    }

}

class B {
    B(int i) {
        System.out.println(" Class B ");
    }

}

public class C extends A {
    C() {
        super(6);
        System.out.println(" Class C");
    }

    public static void main(String[] args) {
        B b = new B(7);
        C c = new C();
    }
}
