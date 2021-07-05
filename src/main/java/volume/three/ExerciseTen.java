package volume.three;

//Exercise 10:A vampire number has an even number of digits and is formed by multiplying a pair of numbers containing half the number of digits of the result.
// The  digits are taken from the original number in any order.
// Pairs of trailing zeroes are not allowed.
//Write a program that finds all the 4-digit vampire numbers.
public class ExerciseTen {
    private static int[] convertIntToArray(int num) {
        int[] array = new int[4];
        array[0] = num / 1000;
        array[1] = (num % 1000) / 100;
        array[2] = ((num % 1000) % 100) / 10;
        array[3] = ((num % 1000) % 100) % 10;
        return array;
    }


    private static void findVampireNumber(int num, int[] a) {

        for (int w = 0; w < 4; w++) {
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    for (int z = 0; z < 4; z++) {
                        if (w != x && x != y && y != z && z != x && w != y && w != z) {
                           int firstPair =combineTwoDigits(a[w], a[x]);
                           int secondPair= combineTwoDigits(a[y], a[z]);

                            if (firstPair * secondPair == num) {
                                System.out.println(firstPair + "*" + secondPair + "=" + num);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    private static int combineTwoDigits(int i, int i1) {
        return i * 10 + i1;
    }

    public static void main(String[] args) {
        for (int i = 1001; i < 9999; i++) {
            int[] a = convertIntToArray(i);
            findVampireNumber(i, a);
        }
    }
}