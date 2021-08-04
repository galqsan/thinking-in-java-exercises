package volume.four;
//Exercise 14:Create a class with a static String field that is initialized at the point of definition, and another one that is initialized by the static block.
// Add a static method that prints both fields and demonstrates that they are both initialized before they are used.
public class ExerciseFourteen {
    static String st1="outside";
    static String st2, st3;
    static {
        st2="first inside";
        st3="second inside";
    }
     static void printFiels(){
         System.out.println(st1+", "+st2+", "+st3 );
     }

    public static void main(String[] args) {
        System.out.println("in main ");
        System.out.println("fourteen.st1:"+fourteen.st1);
        printFiels();
    }
   static ExerciseFourteen fourteen=new ExerciseFourteen();
}

