package volume.eleven;

import volume.eleven.exerciseSix.LoggingExceptions2;

//Exercise 3:  Write code to generate and catch an ArraylndexOutOfBoundsException.
//Exercise 7:Modify Exercise 3 so that the catch clause logs the results.
//Exercise 27: Modify Exercise 3 to convert the exception to a RuntimeException.
public class ExerciseThree {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        try {
            for (int i = 0; i <= 8; i++) {
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught");
            LoggingExceptions2.logException(e);
            throw new RuntimeException(e);
        }

    }
}
