package volume.two;
// Exercise 5 :  Create a class called Dog containing two Strings: name and says.
// In main( ), create two dog objects with names "spot" (who says, "Ruff!") and "scruffy" (who says, "Wurf!").
// Then display their names and what they say.
//Exercise 6:  Following Exercise 5, create a new Dog reference and assign it to spot’s object.
// Test for comparison using == and equals( ) for all references.
public class Dog {
    String name;
    String says;
    void comparing (Dog s,Dog b){
        System.out.println("dog1 == dog3 "+(s==b));
        System.out.println("dog1.equals(dog3) "+ (s.equals(b)));
    }

    public static void main(String[] args) {
        Dog dog1 =new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        dog1.says="Ruff";
        dog2.says="Wurf";
        dog1.name="spot";
        dog2.name="scruffy";
        dog3.name="budy";
        dog3.says="bau";
        System.out.println("dog named "+dog1.name+" says "+dog1.says);
        System.out.println("dog named "+dog2.name+" says "+dog2.says);
        System.out.println("dog named "+dog3.name+" says "+dog3.says);
        dog3.comparing(dog1,dog3);
        dog3=dog1;
        System.out.println("After assign");
        dog3.comparing(dog1,dog3);

    }
}
