package volume.eleven.exerciseTwentyTwo;

import java.util.InvalidPropertiesFormatException;

//Exercise 22: Create a class called FailingConstructor with a constructor that might fail partway through the construction process and throw an exception.
// In main( ), write code that properly guards against this failure.
public class FailingConstructor {
    FailingConstructor(String string) throws InvalidPropertiesFormatException {
        if (string == null) {
            throw new InvalidPropertiesFormatException("String is null");
        }
    }

    public static void main(String[] args) {
        String s = null;
        try {
            FailingConstructor fc = new FailingConstructor(s);
            try {
                System.out.println("In Inner try");
            } finally {
                System.out.println("In finally");
            }
        } catch (InvalidPropertiesFormatException e) {
            System.out.println("Inside the outer try:" + e.getMessage());
        }
    }
}


