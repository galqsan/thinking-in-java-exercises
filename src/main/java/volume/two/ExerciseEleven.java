package volume.two;
//Exercise 11:Start with a number that has a binary one in the most significant position (hint: Use a hexadecimal constant).
// Using the signed right-shift operator, right shift it all the way through all of its binary positions, each time displaying the result using Integer.toBinaryString( ).
public class ExerciseEleven {
    public static void main(String[] args) {
        int i = 2+8;
        for(int f=0;f<5;f++) {
            System.out.println(Integer.toBinaryString(i >> f));
        }

    }
}
