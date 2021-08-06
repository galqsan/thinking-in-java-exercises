package volume.four;
// Exercise 16: Create an array of String objects and assign a String to each element. Print the array by using a for loop.
public class ExerciseSixteen {
    public static void main(String[] args) {
        String [] s = {
          new String("1"),
          new String("2"),
                "3"
        };
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}
