package volume.three;
//Exercise 8:Create a switch statement that prints a message for each case,
// and put the switch inside a for loop that tries each case.
// Put a break after each case and test it, then remove the breaks and see what happens.
public class ExerciseEight {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            switch (i){
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six without break ");

                case 7:
                    System.out.println("seven without break");


            }


        }

    }
}
