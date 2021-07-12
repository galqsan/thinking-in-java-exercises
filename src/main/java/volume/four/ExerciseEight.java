package volume.four;

//Exercise 8:Create a class with two methods. Within the first method, call the second method twice:
// the first time without using this,and the second time using this—just to see it working; you should not use this form in practice.
public class ExerciseEight {
    private void f1() {
        f2();
        this.f2();
    }

    private void f2() {
        System.out.println("second metod");
    }

    public static void main(String[] args) {
        ExerciseEight eight = new ExerciseEight();
        eight.f1();
    }
}
