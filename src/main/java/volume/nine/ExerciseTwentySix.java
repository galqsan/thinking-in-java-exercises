package volume.nine;

//Exercise 26:Create a class with an inner class that has a non-default constructor (one that takes arguments).
// Create a second class with an inner class that inherits from the first inner class.
class OEx26 {
    class IEx26 {
        IEx26(int i) {
            System.out.println("i=" + i);
        }
    }
}

public class ExerciseTwentySix {
    class IExercise26 extends OEx26.IEx26 {

        IExercise26(int i, OEx26 o) {
            o.super(i);
        }
    }

    public static void main(String[] args) {
        ExerciseTwentySix six = new ExerciseTwentySix();
        OEx26 o = new OEx26();
        IExercise26 inner = six.new IExercise26(6, o);
    }
}
