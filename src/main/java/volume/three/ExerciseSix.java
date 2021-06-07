package volume.three;
//Exercise 6: Modify the two test( ) methods in the previous two programs so that they take two extra arguments,
// begin and end, and so that testval is tested to see if it is within the range between (and including) begin and end.
public class ExerciseSix {
    static int test(int testval, int target,int begin,int end) {

        if(testval > target&&begin<= testval&&testval<=end)
            return +1;
        else if(testval < target&&begin<= testval&&testval<=end)
            return -1;
        else
            return 0; // Match
    }

    public static void main(String[] args) {
        System.out.println(test(2,4,2,7));

    }
}
