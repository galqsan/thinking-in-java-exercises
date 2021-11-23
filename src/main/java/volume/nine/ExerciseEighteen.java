package volume.nine;

//Exercise 18:Create a class containing a nested class.
// In main( ), create an instance of the nested class.
public class ExerciseEighteen {
    static class InnerEighteen {
        void i() {
            System.out.println("InnerEighteen.i()");
        }
    }

    void o() {
        System.out.println("ExerciseEighteen.o()");
    }

    public static void main(String[] args) {
        InnerEighteen inner = new InnerEighteen();
        ExerciseEighteen eighteen = new ExerciseEighteen();
        inner.i();
        eighteen.o();

    }
}
