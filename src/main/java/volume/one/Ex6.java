package volume.one;

public class Ex6 {
    int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        String s ="987";
        Ex6 inst=new Ex6();
        System.out.println("Metod storage: " +inst.storage(s));


    }
}
