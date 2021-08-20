package volume.five;

//Exercise 3:Create two packages: debug and debugoff, containing an identical class with a debug( ) method.
// The first version displays its String argument to the console, the
//second does nothing. Use a static import line to import the class into a test program, and demonstrate the conditional compilation effect.

import static volume.five.debugoff.Debug.debug;

public class ExerciseThree {
    public static void main(String[] args) {
        volume.five.debugoff.Debug d = new volume.five.debugoff.Debug();//can't identify the method with the import, because of the identical names
        d.debug(" package debugoff");
    }
}
