package volume.eleven;

//Exercise 3:  Write code to generate and catch an ArraylndexOutOfBoundsException.
public class ExerciseThree {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        try {
            for (int i = 0; i <= 8; i++) {
                System.out.println(array[i]);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught");
        }
    }
}
