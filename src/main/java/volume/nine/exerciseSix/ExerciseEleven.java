package volume.nine.exerciseSix;

//Exercise 11:Create a private inner class that implements a public interface.
// Write a method that returns a reference to an instance of the private inner class, upcast to the interface.
// Show that the inner class is completely hidden by trying to downcast to it.
interface Ex11 {
}

class Exercise11 {
    private class Inner11 implements Ex11 {
    }

    Ex11 getInner11U() {
        return new Inner11();
    }

    Inner11 getInner11() {
        return new Inner11();
    }

    public static void main(String[] args) {
        Exercise11 eleven = new Exercise11();
        Ex11 ex11 = eleven.getInner11U();
        ex11 = eleven.getInner11();
        // (Exercise11.Inner11)eleven.getInner11();
    }

}

public class ExerciseEleven {
    public static void main(String[] args) {
        Exercise11 eleven = new Exercise11();
        Ex11 ex11 = eleven.getInner11U();
        //(Exercise11.Inner11)eleven.getInner11();//the Inner class has a private access so it cannot be downcast
    }

}