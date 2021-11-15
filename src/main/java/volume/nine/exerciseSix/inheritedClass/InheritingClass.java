package volume.nine.exerciseSix.inheritedClass;

import volume.nine.exerciseSix.innerClass.Outer6;
import volume.nine.exerciseSix.interface6.Interf6;

//Exercise 6:Create an interface with at least one method, in its own package.
// Create a class in a separate package. Add a protected inner class that implements the interface.
// In a third package, inherit from your class and, inside a method, return an object of the protected inner class, upcasting to the interface during the return.
public class InheritingClass extends Outer6 {
    public Interf6 getInner6() {
        return new Inner6();
    }

    public static void main(String[] args) {
        new InheritingClass().getInner6().interfaceMethod();
    }
}
