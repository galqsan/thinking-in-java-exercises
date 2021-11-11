package volume.eight;

import static volume.eight.Months.*;

//Exercise 17:Prove that the fields in an interface are implicitly static and final.
interface Months {
    int
            JANUARY = 1, FEBRUARY = 2, MARCH = 3,
            APRIL = 4, MAY = 5, JUNE = 6, JULY = 7,
            AUGUST = 8, SEPTEMBER = 9, OCTOBER = 10,
            NOVEMBER = 11, DECEMBER = 12;
}

public class ExerciseSeventeen {
    public static void main(String[] args) {
        //JANUARY=5;//Cannot assign a value to final variable 'JANUARY'
        System.out.println("Month April: " + APRIL);
    }

}
