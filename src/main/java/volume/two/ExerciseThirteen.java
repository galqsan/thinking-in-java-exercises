package volume.two;
//Exercise 13: Write a method that displays char values in binary form.
// Demonstrate it using several different characters.
public class ExerciseThirteen {
    static void  binaryConvertor(char a){
        System.out.println("char "+a+"  is binary represented "+Integer.toBinaryString(a));
    }

    public static void main(String[] args) {
        char b ='h';
        int i =45;
        binaryConvertor(b);
        b='U';
        binaryConvertor(b);
        b='p';
        binaryConvertor(b);
        b+=11;
        binaryConvertor(b);

    }

}
