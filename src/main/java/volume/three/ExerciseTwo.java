package volume.three;

import java.util.Random;
//Exercise 2:Write a program that generates 25 random int values.
// For each value, use an if-else statement to classify it as greater than, less than, or equal to a second randomly generated value.
public class ExerciseTwo {
    public static void main(String[] args) {
        int result1;
        int result2;
        Random rand =new Random();
        for(int i=1;i<=25;i++){
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
