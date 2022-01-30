package volume.eleven;

//Exercise 10: Create a class with two methods, f( ) and g( ).
// In g( ), throw an exception of a new type that you define. In f( ), call g( ), catch its exception and, in the catch clause, throw a different exception (of a second type that you define).
// Test your code in main( ).
//Exercise 11:Repeat the previous exercise, but inside the catch clause, wrap g( )’s exception in a RuntimeException.
class OneException extends Exception {
    OneException(String s) {
        super(s);
    }
}

public class ExerciseTen {
    static void g() throws OneException {
        throw new OneException("Inside g()");
    }

    public static void f() {
        try {
            g();
        } catch (OneException e) {
            e.printStackTrace(System.out);
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        f();
    }
}
