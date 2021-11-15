package volume.nine.exerciseSix.innerClass;

import volume.nine.exerciseSix.interface6.Interf6;

public class Outer6 {
    protected class Inner6 implements Interf6 {
        public Inner6() {
        }

        @Override
        public void interfaceMethod() {
            System.out.println("Exercise Six");
        }
    }
}
