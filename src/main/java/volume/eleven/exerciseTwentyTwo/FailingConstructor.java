package volume.eleven.exerciseTwentyTwo;

import java.util.InvalidPropertiesFormatException;

//Exercise 22: Create a class called FailingConstructor with a constructor that might fail partway
// through the construction process and throw an exception.
// In main( ), write code that properly guards against this failure.
//Exercise 23:  Add a class with a dispose() method to the previous exercise. Modify
//FailingConstructor so that the constructor creates one of these disposable objects as a
//member object, after which the constructor might throw an exception, after which it creates a
//second disposable member object. Write code to properly guard against failure, and in
//main( ) verify that all possible failure situations are covered.
//Exercise 24: Add a dispose ( ) method to the FailingConstructor class and write
//code to properly use this class.
class Ex23 {
    private int id;

    Ex23(int id) {
        this.id = id;
        System.out.println("Constructor Ex23 with id:" + id);
    }

    void dispose() {
        System.out.println("dispose() " + id);
    }
}

public class FailingConstructor {
    private final Ex23 ex23one, ex23two;

    FailingConstructor(String string) throws InvalidPropertiesFormatException {
        ex23one = new Ex23(1);
        try {
            if (string == null) {
                throw new InvalidPropertiesFormatException("String is null");
            }
        } catch (InvalidPropertiesFormatException e) {
            ex23one.dispose();
            throw e;
        }
        ex23two = new Ex23(2);
    }

    void dispose() {
        System.out.println("FailingConstructor.dispose()");
        ex23two.dispose();
        ex23one.dispose();
    }

    public static void main(String[] args) {

        for (String s = "1"; ; s = null) {
            try {
                FailingConstructor fc = new FailingConstructor(s);
                try {
                    System.out.println("Inner try");
                } finally {
                    fc.dispose();
                }
            } catch (InvalidPropertiesFormatException e) {
                System.out.println("Inside the outer try:" + e.getMessage());
                break;
            }
        }
    }
}


