package volume.eleven;

//Exercise 8:Write a class with a method that throws an exception of the type created in Exercise 4.
// Try compiling it without an exception specification to see what the compiler says. Add the appropriate exception specification.
// Try out your class and its exception inside a try-catch clause.
class Ex8 {
    static void throwEx4Exception() throws ExerciseFourException {
        throw new ExerciseFourException("In Ex8");
        //The compiler give a error when there is no exception specification
    }
}

public class ExerciseEight {
    public static void main(String[] args) {
        try {
            Ex8.throwEx4Exception();
        } catch (ExerciseFourException e) {
            e.printS();
        }
    }

}

