package volume.six;

//Exercise 8:Create a base class with only a non-default constructor, and a derived class with both a default (no-arg) and non-default constructor.
// In the derived-class constructors, call the base-class constructor.
class EightBase {
    EightBase(char a) {
        System.out.println("Base Class");
    }
}

public class ExerciseEightDerived extends EightBase {
    ExerciseEightDerived() {
        super('c');
        System.out.println("Deprived non arg");
    }

    ExerciseEightDerived(int i) {
        super('b');
        System.out.println(" Deprived arg i:" + i);
    }

    public static void main(String[] args) {
        new ExerciseEightDerived();
        new ExerciseEightDerived(8);
    }
}
