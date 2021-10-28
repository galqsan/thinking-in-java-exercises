package volume.eight.exFive;

import volume.eight.exFive.exerciseFive.ExFiveI;

//Exercise 5:Create an interface containing three methods, in its own package.
// Implement the interface in a different package.
//Exercise 6:Prove that all the methods in an interface are automatically public.
public class ExerciseFive implements ExFiveI {

    //gives a error ,because java doesn't allow to  override from higher access to lower access
    //that prove the methods  in the interface are public
    //void p(){}
    public void p() {
        System.out.println(" ExerciseFive.p()");
    }

    public void m() {
        System.out.println(" ExerciseFive.m()");
    }

    public void c() {
        System.out.println(" ExerciseFive.c()");
    }
}
