package volume.eleven;

import java.util.ArrayList;
import java.util.List;

//Exercise 9:Create three new types of exceptions.
//Write a class with a method that throws all three.
//In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
//Exercise 13:Modify Exercise 9 by adding a finally clause.
// Verify that your finally clause is executed, even if a NullPointerException is thrown.
class FirstException extends Exception {
}

class SecondException extends Exception {
}

class ThirtException extends Exception {
}

public class ExerciseNine {
    private void fillExceptionsList(List<Exception> exceptionsList) throws Exception {
        exceptionsList.add(new FirstException());
        exceptionsList.add(new SecondException());
        exceptionsList.add(new ThirtException());
        for (Exception anException : exceptionsList) {
            throw anException;
        }
    }

    public static void main(String[] args) {
        List<Exception> exceptionsList = new ArrayList<>();
        ExerciseNine exerciseNine = new ExerciseNine();
        try {
            exerciseNine.fillExceptionsList(exceptionsList);
            throw new NullPointerException();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Inside the finally ");
        }
    }
}
