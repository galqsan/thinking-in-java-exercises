package volume.six;

//Exercise 4: Prove that the base-class constructors are (a) always called and (b) called before derived-class constructors.
public class ExerciseFour {
    ExerciseFour() {
        System.out.println("base-class");
    }
}

class Four extends ExerciseFour {
    Four() {
        System.out.println("derived-class");
    }

    public static void main(String[] args) {
        new Four();
        new ExerciseFour();
    }

}
