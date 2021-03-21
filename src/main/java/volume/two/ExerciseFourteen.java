package volume.two;
//Exercise 14: Write a method that takes two String arguments and uses all the boolean comparisons to compare the two Strings and print the results.
// For the == and !=, also perform the equals( ) test. In main( ), call your method with some different String objects.
public class ExerciseFourteen {
    static void stringComparing(String a,String  b){
        System.out.println(a+" == "+b+ " is "+ (a==b));
        System.out.println(a+" != "+b+ " is "+ (a!=b));
        System.out.println(a+". equal "+b+ " is "+ a.equals(b));
    }
    public static void main(String[] args) {
        String s1 ="eq";
        String s2="string1";
        String s3="string1";
        String s=new String("eq");
        stringComparing(s1,s2);
        stringComparing(s2,s3);
        stringComparing(s,s1);
    }
}
