package volume.twelve;

//Exercise 6:  Create a class that contains int, long, float and double fields. Create a
//toString( ) method for this class that uses String.format( ), and demonstrate that your
//class works correctly.
public class ExerciseSix {
    int i;
    long l;
    float f;
    double d;

    ExerciseSix(int i, long l, float f, double d) {
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
    }

    public String toString() {
        return String.format("%d,%d,%f,%f", i, l, f, d);
    }

    public static void main(String[] args) {
        ExerciseSix six = new ExerciseSix(2, 58, 2.555f, 2.54);
        System.out.println(six);
    }
}
