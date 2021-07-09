package volume.four;
//Exercise 7:Create a class without a constructor
// , and then create an object of that class in main( ) to verify that the default constructor is automatically synthesized.
public class ExerciseSeven {
    void f(){
        System.out.println("Exercise seven");
    }
    public static void main(String[] args) {
        ExerciseSeven seven =new ExerciseSeven();
        seven.f();
    }
}
