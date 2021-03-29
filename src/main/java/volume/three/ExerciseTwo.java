package volume.three;

import java.util.Random;
//Exercise 3: Modify Exercise 2 so that your code is surrounded by an “infinite” while loop.
// It will then run until you interrupt it from the keyboard (typically by pressing Control-C).
public class ExerciseTwo {
    public static void main(String[] args) {
        int result1;
        int result2;
        Random rand =new Random();
        while(true){
            result1=rand.nextInt(1000);
            result2=rand.nextInt(1000);
            System.out.println("first randomly generated value: "+result1+" and the second value: "+result2 );
            if(result1>result2){
                System.out.println(result1+">"+result2);
            }
            else if (result1<result2){
                System.out.println(result1+"<"+result2);
            }
            else {
                System.out.println(result1+"="+result2);

            }

        }
    }

}
