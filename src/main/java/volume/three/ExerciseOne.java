package volume.three;
//Exercise 1:Write a program that prints values from 1 to 100.
//Exercise 7:Modify Exercise 1 so that the program exits by using the break keyword at value 99.
// Try using return instead.
public class ExerciseOne {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++) {
            System.out.println("interation number with break: " + i);
            if(i==99)
                break;
        }
        for (int i=1;i<=100;i++) {
            System.out.println("interation number with return: " + i);
            if(i==99)
                return;
        }
    }
}
