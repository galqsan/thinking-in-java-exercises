package volume.nine;

//Exercise 9:Create an interface with at least one method, and implement that interface by defining an inner class within a method, which returns a reference to your interface.
interface Interface9 {
    void innerClassMethod();
}

public class ExerciseNine {
    public Interface9 innerClassMethod() {
        class InnerClass9 implements Interface9 {
            @Override
            public void innerClassMethod() {
                System.out.println("implementation of the interface method");
            }
        }
        return new InnerClass9();
    }

    public static void main(String[] args) {
        Interface9 in = new ExerciseNine().innerClassMethod();
        in.innerClassMethod();
    }
}
