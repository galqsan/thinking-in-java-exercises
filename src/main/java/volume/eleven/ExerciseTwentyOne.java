package volume.eleven;

//Exercise 21:Demonstrate that a derived-class constructor cannot catch exceptions thrown by its base-class constructor.
class Ex21 {
    Ex21() throws Exception {
        throw new Exception();
    }
}

public class ExerciseTwentyOne extends Ex21 {
    //    ExerciseTwentyOne() throws Exception{
//        try {
//            super();
//        }catch (Exception e){}
//
//    }
//Gives a error: the super() must be the first statement in the constructor
    ExerciseTwentyOne() throws Exception {
    }

    public static void main(String[] args) {
        try {
            ExerciseTwentyOne ex21 = new ExerciseTwentyOne();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
