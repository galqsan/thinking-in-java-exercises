package volume.three;
//Exercise 4:Write a program that uses two nested for loops and the modulus operator (%) to detect and print prime numbers (integral numbers that are not evenly divisible by any other numbers except for themselves and 1).
public class ExerciseFour {
    public static void main(String[] args) {

        for (int i = 1; i<=100 ; i++) {
            boolean isPrime=true;
            for (int j = 2 ; j <= (i/2) ; j++ ) {

                if (i%j == 0 ) {
                    isPrime= false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("Prime number: "+i);
            }
        }

    }
}
