package volume.eleven.exerciseTwentyFive;

//Exercise 25: Create a three-level hierarchy of exceptions. Now create a base-class A
//with a method that throws an exception at the base of your hierarchy. Inherit B from A and
//override the method so it throws an exception at level two of your hierarchy. Repeat by
//inheriting class C from B. In main( ), create a C and upcast it to A, then call the method.
class FirstException extends Exception {
}

class SecondException extends FirstException {
}

class ThirtException extends SecondException {
}

class A {
    void a() throws FirstException {
        throw new FirstException();
    }
}

class B extends A {
    @Override
    void a() throws SecondException {
        throw new SecondException();
    }
}

public class C extends B {
    @Override
    void a() throws ThirtException {
        throw new ThirtException();
    }

    public static void main(String[] args) {
        A a = new C();
        try {
            a.a();
        } catch (FirstException e) {
            System.out.println("Caught " + e);
        }
    }
}
