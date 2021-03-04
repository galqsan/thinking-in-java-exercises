package volume.two;
// Exercise 7: Write a program that simulates coin-flipping.
import java.util.Random;

public class ExerciseSeven {
    public static void main(String[] args) {
        Random coin =new Random();
        if(coin.nextBoolean()==true){
            System.out.println("Head");
        }
        else {
            System.out.println("Tails");
        }
    }
}
