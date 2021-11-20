package volume.nine;

//Exercise 9:Create an interface with at least one method, and implement that interface by defining an inner class within a method, which returns a reference to your interface.
//Exercise 10:Repeat the previous exercise but define the inner class within a scope within a method.
//Exercise 13:Repeat Exercise 9 using an anonymous inner class.
interface Interface9 {
    void innerClassMethod();
}

public class ExerciseNine {
    public Interface9 outerClassMethod() {
        {
            return new Interface9() {

                @Override
                public void innerClassMethod() {
                    System.out.println("implementation of the interface method");
                }

            };
        }
    }

    public static void main(String[] args) {
        Interface9 in = new ExerciseNine().outerClassMethod();
        in.innerClassMethod();

    }
}
