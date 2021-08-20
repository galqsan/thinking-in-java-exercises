package volume.five;
//Exercise 4: Show that protected methods have package access but are not public.

import volume.five.ex1v5.Vector;

public class ExerciseFour {
    public static void main(String[] args) {
        AcTestExFour acTestExFour = new AcTestExFour();
        acTestExFour.acTest();
        Vector v = new Vector();
        // v.accessTest();//Can’t access
    }
}
