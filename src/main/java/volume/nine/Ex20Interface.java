package volume.nine;

//Exercise 20:Create an interface containing a nested class.
// Implement this interface and create an instance of the nested class.
public interface Ex20Interface {
    void v();

    class ExerciseTwenty implements Ex20Interface {

        @Override
        public void v() {
            System.out.println("ExerciseTwenty.v()");
        }

    }
}

class Ex20 {
    public static void main(String[] args) {
        Ex20Interface.ExerciseTwenty twenty = new Ex20Interface.ExerciseTwenty();
        twenty.v();
    }
}