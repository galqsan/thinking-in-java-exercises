package volume.six;

//Exercise 21:Create a class with a final method.
// Inherit from that class and attempt to overwrite that method.
class TwentyOneBade {
    final void finalMethod() {
        System.out.println("finalMethod()");
    }
}

public class ExerciseTwentyOne extends TwentyOneBade {
    //    @Override //'finalMethod()' cannot override 'finalMethod()'because the overridden method is final
//    final void finalMethod(){
//        System.out.println("override");
//
//    }s
    public static void main(String[] args) {
        ExerciseTwentyOne twentyOne = new ExerciseTwentyOne();
        twentyOne.finalMethod();
    }

}
