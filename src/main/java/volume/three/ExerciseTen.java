package volume.three;


//Exercise 10:A vampire number has an even number of digits and is formed by multiplying a pair of numbers containing half the number of digits of the result.
// The  digits are taken from the original number in any order.
// Pairs of trailing zeroes are not allowed.
//Write a program that finds all the 4-digit vampire numbers.
public class ExerciseTen {
    public static int[] convertIntToArray(int num) {
        String temp = Integer.toString(num);
        int[] array = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            array[i] = temp.charAt(i) - '0';
        }
        return array;

    }

    public static void findVampireNumber(int num, int[] a) {

        for (int w = 0; w < 4; w++) {
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    for (int z = 0; z < 4; z++) {
                        if (w != x && x != y && y != z && z != x && w != y && w != z) {
                            if ((a[w] * 10 + a[x]) * (a[y] * 10 + a[z]) == num && (a[w] * 10 + a[x]) > 10 && (a[y] * 10 + a[z]) > 10) {
                                System.out.println(" This is vampire number");
                                return;
                            }
                            if ((a[w] == a[x] && a[x] == a[y] && a[y] == a[z]) || (a[2] == 0 && a[3] == 0)) {
                                System.out.println("This is not vampire number");
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int n = 2187;
        int[] a = convertIntToArray(n);
        findVampireNumber(n, a);

    }
}