package volume.nine;

//Exercise 15:Create a class with a non-default constructor (one with arguments) and no default constructor (no "no-arg" constructor).
// Create a second class that has a method that returns a reference to an object of the first class.
// Create the object that you return by making an anonymous inner class that inherits from the first class.
class Ex15 {

    Ex15(int i) {
        System.out.println("non-default constructor i= " + i);
    }

    public void v() {
        System.out.println("Ex15.f()");
    }
}

public class ExerciseFifteen {
    Ex15 getEx15() {
        return new Ex15(8);
    }

    Ex15 ex15() {
        return new Ex15(5) {
            {
                System.out.println("Anonymous class");
            }

            @Override
            public void v() {
                System.out.println("ExerciseFifteen.v()");
            }
        };
    }

    public static void main(String[] args) {
        ExerciseFifteen fifteen = new ExerciseFifteen();
        Ex15 ex15 = fifteen.getEx15();
        ex15.v();
        ex15 = fifteen.ex15();
        ex15.v();

    }
}
