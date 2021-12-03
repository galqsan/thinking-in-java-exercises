package volume.nine;

//Exercise 7:Create a class with a private field and a private method. Create an inner class with a method that modifies the outer-class field and calls the outer-class method.
// In a second outer-class method, create an object of the inner class and call its method, then show the effect on the outer-class object.
//Exercise 8:Determine whether an outer class has access to the private elements of its inner class.
//Exercise 12: Repeat Exercise 7 using an anonymous inner class.
interface AnonymousInner {
    void modifyPrivateField();

    int h();
}

public class ExerciseSeven {
    private String s;
    AnonymousInner innerr = anonymousInner();

    private void privateMethod() {
        System.out.println(s);

    }

    public AnonymousInner anonymousInner() {
        return new AnonymousInner() {

            private int i = 17;

            public int h() {
                return i;
            }

            public void modifyPrivateField() {
                s = "Exercise seven";
                privateMethod();

            }
        };
    }

    void outerMethod() {
        innerr.modifyPrivateField();
    }

    public static void main(String[] args) {
        ExerciseSeven seven = new ExerciseSeven();
        AnonymousInner inner = seven.anonymousInner();
        seven.outerMethod();
        System.out.println("Private inner field i=" + inner.h());
    }
}
