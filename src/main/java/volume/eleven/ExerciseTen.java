package volume.eleven;

//Exercise 10: Create a class with two methods, f( ) and g( ).
// In g( ), throw an exception of a new type that you define. In f( ), call g( ), catch its exception and, in the catch clause, throw a different exception (of a second type that you define).
// Test your code in main( ).
class OneException extends Exception {
    OneException(String s) {
        super(s);
    }
}

class TwoExceptions extends Exception {
    TwoExceptions(String s) {
        super(s);
    }
}

public class ExerciseTen {
    static void g() throws OneException {
        throw new OneException("Inside g()");
    }

    public static void f() throws TwoExceptions {
        try {
            g();
        } catch (OneException e) {
            e.printStackTrace(System.out);
            throw new TwoExceptions("Inside f()");
        }
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (TwoExceptions twoExceptions) {
            System.out.println("In main:");
            twoExceptions.printStackTrace(System.out);
        }
    }
}
