package volume.nine;

//Exercise 7:Create a class with a private field and a private method. Create an inner class with a method that modifies the outer-class field and calls the outer-class method.
// In a second outer-class method, create an object of the inner class and call its method, then show the effect on the outer-class object.
//Exercise 8:Determine whether an outer class has access to the private elements of its inner class.
public class ExerciseSeven {
    private String s;

    private void privateMethod() {
        System.out.println(s);

    }

    class Inner7 {
        private int i = 17;

        public void modifyPrivateField() {
            s = "Exercise seven";
            privateMethod();
        }
    }

    void outerMethod() {
        new Inner7().modifyPrivateField();
    }

    public static void main(String[] args) {
        ExerciseSeven seven = new ExerciseSeven();
        ExerciseSeven.Inner7 inner = seven.new Inner7();
        seven.outerMethod();
        System.out.println("Private inner field i=" + inner.i);
        //The outer class has a access to the private inner class field


    }
}
