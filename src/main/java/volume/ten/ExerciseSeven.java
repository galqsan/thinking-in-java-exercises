package volume.ten;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Exercise 7:Create a class, then make an initialized array of objects of your class.
// Fill a List from your array.
// Create a subset of your List by using subList( ), then remove this subset from your List.
public class ExerciseSeven {
    public String toString() {
        return "Exercise Seven";
    }

    public static void main(String[] args) {
        ExerciseSeven[] array = new ExerciseSeven[7];
        for (int i = 0; i < array.length; i++)
            array[i] = new ExerciseSeven();
        List<ExerciseSeven> objList = new ArrayList<>(Arrays.asList(array));
        List<ExerciseSeven> sub = objList.subList(1, 4);
        System.out.println("List:" + objList);
        System.out.println("subList:" + sub);
        //objList.removeAll(sub);//
        sub.clear();
        System.out.println("List:" + objList);
        System.out.println("subList:" + sub);
    }
}
