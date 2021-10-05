package volume.six.exerciseFifteen;

import volume.six.exerciseFifteen.exFifteen.FifteenB;

//Exercise 15: Create a class inside a package. Your class should contain a protected method.
// Outside of the package, try to call the protected method and explain the results.
// Now inherit from your class and call the protected method from inside a method of your derived class.
public class ExerciseFifteen extends FifteenB {
    public static void main(String[] args) {
        ExerciseFifteen f = new ExerciseFifteen();
        //  FifteenB b=new FifteenB();
        // b.protectedMethod();//If there is no inheritance between the classes this method can't be used in this class.
        f.protectedMethod();

    }
}
