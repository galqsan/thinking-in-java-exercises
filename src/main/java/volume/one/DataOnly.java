package volume.one;

public class DataOnly /*Ex4 & Ex5  */ {
    int i;
    double d;
    boolean b;
    public static void main(String[] args) {

        DataOnly data = new DataOnly();
        data.i = 47;
        data.d = 1.1;
        data.b = false;
        System.out.println("int :"+data.i+"\ndouble :"+data.d+"\nboolean :"+data.b);
    }

}
