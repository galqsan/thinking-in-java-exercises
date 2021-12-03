package volume.nine.exerciseTwentyThree;

//Exercise 23: Create an interface U with three methods.
// Create a class A with a method that produces a reference to a U by building an anonymous inner class.
// Create a second class B that contains an array of U.
// B should have one method that accepts and stores a reference to a U in the array,
// a second method that sets a reference in the array (specified by the method argument) to null,
// and a third method that moves through the array and calls the methods in U.
// In main( ), create a group of A objects and a single B.
// Fill the B with U references produced by the A objects.
// Use the B to call back into all the A objects.
// Remove some of the U references from the B.
interface U {
    void a();

    void b();

    void c();
}

class B {
    private int i = 0;
    U[] uArray;

    public B(int size) {
        uArray = new U[size];
    }

    void first(U ref) {
        for (int i = 0; i < uArray.length; i++) {
            if (uArray[i] == null) {
                uArray[i] = ref;
            }
        }
    }

    void second(int i) {
        uArray[i] = null;
    }

    void thirt() {
        for (int i = 0; i < uArray.length; i++) {
            if (uArray[i] != null) {
                uArray[i].a();
                uArray[i].b();
                uArray[i].c();
            }
        }
    }
}

public class A {
    public U anonymousU() {
        return new U() {

            @Override
            public void a() {
                System.out.println("A.a()");
            }

            @Override
            public void b() {
                System.out.println("A.b()");
            }

            @Override
            public void c() {
                System.out.println("A.c()");
            }
        };
    }

    public static void main(String[] args) {
        A[] a = {new A(), new A(), new A(), new A()};
        B b = new B(4);
        for (int i = 0; i < a.length; i++)
            b.first(a[i].anonymousU());
        b.thirt();
        System.out.println();
        b.second(1);
        b.thirt();
    }
}
