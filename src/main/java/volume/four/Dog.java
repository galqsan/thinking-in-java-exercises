package volume.four;
//Exercise 5:Create a class called Dog with an overloaded bark( ) method.
// This method should be overloaded based on various primitive data types, and print different types of barking, howling, etc., depending on which overloaded version is called.
// Write a main( ) that calls all the different versions.
public class Dog {
    void bark(char a){
        System.out.println("bau");
    }
    void bark(int i){
        System.out.println("howing");
    }
    void bark(byte b){
        System.out.println(" jjj");
    }
    void bark(short s){
        System.out.println(" zzz");
    }
    void bark(long l){
        System.out.println(" sss");
    }
    void bark(float f){
        System.out.println("brr");
    }
    void bark(double d){
        System.out.println("grr");
    }
    void bark(String name){
        System.out.println(" bark");
    }


    public static void main(String[] args) {
        Dog dog=new Dog();
        int i=2;

        dog.bark('a');
        dog.bark((byte)i);
        dog.bark((short)i);
        dog.bark((long)i);
        dog.bark(3.5f);
        dog.bark(8.1);
        dog.bark(5);
        dog.bark("Boby");
    }

}
