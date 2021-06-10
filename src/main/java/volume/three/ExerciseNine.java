package volume.three;
//Exercise 9:A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on,where each number
// (from the third on) is the sum of the previous two.
// Create a method that takes an integer as an argument and displays that many Fibonacci numbers starting from the beginning, e.g.
// If you run java Fibonacci 5 (where Fibonacci is the name of the class) the output will be: 1, 1, 2, 3, 5.
public class ExerciseNine {
    public void fibonacciNum(int b){
        int a=0;
        int c;
        for(int i=0;i<10;i++){
           c=a+b;
            System.out.print(c +" ");
            b=a;
            a=c;
        }
    }
    public static void main(String[] args) {
        ExerciseNine n=new ExerciseNine();
        n.fibonacciNum(1);
    }
}
