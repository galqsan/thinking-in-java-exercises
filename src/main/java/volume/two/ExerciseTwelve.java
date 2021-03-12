package volume.two;
//Exercise 12: Start with a number that is all binary ones.
//Left shift it, then use the unsigned right-shift operator to right shift through all of its binary positions, each time displaying the result using Integer.toBinaryString( ).
public class ExerciseTwelve {
    public static void main(String[] args) {
        int bin =31;
        System.out.println("bin: "+Integer.toBinaryString(bin));
        System.out.println("bin left shift: "+Integer.toBinaryString(bin<<=3));
        for(int f=0;f<8;f++) {
            System.out.println(Integer.toBinaryString(bin >>>= 1));
        }


    }
}
