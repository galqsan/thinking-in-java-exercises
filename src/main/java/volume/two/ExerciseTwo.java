package volume.two;

//Create a class containing a float and use it to demonstrate aliasing.
public class ExerciseTwo {
    float container;

    public static void main(String[] args) {
        ExerciseTwo t1 = new ExerciseTwo();
        ExerciseTwo t2 = new ExerciseTwo();
        t1.container = 2;
        t2.container = 6;
        System.out.println(" t1.container:" + t1.container + " t2.container:" + t2.container);
        t1.container = t2.container;
        System.out.println(" t1.container:" + t1.container + " t2.container:" + t2.container);
        t1.container = 9;
        System.out.println(" t1.container:" + t1.container + " t2.container:" + t2.container);
        t1 = t2;
        System.out.println(" t1.container:" + t1.container + " t2.container:" + t2.container);
        t2.container = 23;
        System.out.println(" t1.container:" + t1.container + " t2.container:" + t2.container);


    }
}
