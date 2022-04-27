package volume.thirteen;

/*Exercise 10:Write a program to determine whether an array of char is a primitive
type or a true Object. */
public class ExerciseTen {
    public static void primitiveOrObject(Object obj) {
        Class c = obj.getClass();
        if (c.getComponentType().isPrimitive()) {
            System.out.println(c.getSimpleName() + " is primitive ");
        } else {
            System.out.println(c.getSimpleName() + "is Object");
        }
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'a'};
        primitiveOrObject(chars);
    }
}
