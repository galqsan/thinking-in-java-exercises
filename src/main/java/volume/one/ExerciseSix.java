package volume.one;

public class ExerciseSix {
    int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        String s ="987";
        ExerciseSix inst=new ExerciseSix();
        System.out.println("Metod storage: " +inst.storage(s));


    }
}
