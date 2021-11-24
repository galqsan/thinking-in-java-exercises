package volume.nine.exerciseNineteen;

//Exercise 19:Create a class containing an inner class that itself contains an inner class.
// Repeat this using nested classes.
// Note the names of the .class files produced by the compiler.
public class Outer1 {
    class Inner1 {
        class Inner2 {
            void v() {
                System.out.println("Inner2.v()");
            }

        }

        void v() {
            System.out.println("Inner1.v()");
        }

        Inner2 getInner2() {
            return new Inner2();
        }
    }

    Inner1 getInner1() {
        return new Inner1();
    }

    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        Outer1.Inner1 inner1 = outer1.getInner1();
        Outer1.Inner1.Inner2 inner2 = inner1.getInner2();
        inner1.v();
        inner2.v();
        Outer2.StaticInner1 staticInner1 = new Outer2.StaticInner1();
        Outer2.StaticInner1.StaticInner2 staticInner2 = new Outer2.StaticInner1.StaticInner2();
        staticInner1.v();
        staticInner2.v();
    }
}
