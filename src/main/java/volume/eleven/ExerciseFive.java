package volume.eleven;

//Exercise 5:Create your own resumption-like behavior using a while loop that repeats until an exception is no longer thrown.
public class ExerciseFive {
    static void throwExeption(int index) throws Exception {
        if (index < 0) {
            throw new Exception();
        }

    }

    public static void main(String[] args) {
        boolean flag = true;
        int i = -5;
        while (flag) {
            try {
                flag = false;
                throwExeption(i++);
            } catch (Exception e) {
                flag = true;

                System.out.println(i);
            }
        }

    }
}
