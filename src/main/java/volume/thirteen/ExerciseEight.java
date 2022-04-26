package volume.thirteen;

import volume.eight.ExThirteen;

import java.lang.reflect.Field;

/*Exercise 8:  Write a method that takes an object and recursively prints all the classes
in that object’s hierarchy. */
/*Exercise 9: Modify the previous exercise so that it uses
Class.getDeclaredFields( ) to also display information about the fields in a class.*/
public class ExerciseEight {
    public static void hierarchyPrinter(Class c) {
        if (c == null) return;
        Class cls = c.getClass();
        Field[] fields = cls.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println("Field = " + fields[i].toString());
        }
        System.out.println(c.getSimpleName());
        for (Class i : c.getInterfaces()) {
            System.out.println("Interfaces hierarchy: " + i.getSimpleName());
            interfaceHierarchy(i.getInterfaces());
        }
        System.out.println("Classes hierarchy: " + c.getSimpleName());
        hierarchyPrinter(c.getSuperclass());

    }

    private static void interfaceHierarchy(Class<?>[] i) {
        if (i == null) return;
        for (Class c : i) {
            System.out.println("Interfaces hierarchy: " + c.getSimpleName());
            for (Class interfaces : c.getInterfaces()) {
                System.out.println("Interfaces hierarchy: " + interfaces.getSimpleName());
            }
        }
    }

    public static void main(String[] args) {
        ExerciseEight.hierarchyPrinter(ExThirteen.class);
    }

}
