package volume.two;
//Create a class containing a float and use it to demonstrate aliasing during method calls.
public class ExerciseThree {
    float container;
    static void f(ExerciseTwo x){
        x.container=2.2f;
    }

    public static void main(String[] args) {
        ExerciseTwo y =new ExerciseTwo();
        y.container=72;
        System.out.println("1:"+y.container);
        f(y);
        System.out.println("2:"+y.container);
    }
}
