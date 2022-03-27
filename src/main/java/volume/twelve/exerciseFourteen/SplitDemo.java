package volume.twelve.exerciseFourteen;

import java.util.Arrays;

//Exercise 14:Rewrite SplitDemo using String.split( ).
public class SplitDemo {
    public static void main(String[] args) {
        String input =
                "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(
                input.split("!!")));
        // Only do the first three:
        System.out.println(Arrays.toString(
                input.split("!!", 3)));
    }
}