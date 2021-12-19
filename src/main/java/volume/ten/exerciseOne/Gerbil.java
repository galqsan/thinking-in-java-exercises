package volume.ten.exerciseOne;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Exercise 1:Create a new class called Gerbil with an int gerbilNumber that’s initialized in the constructor.
//Give it a method called hop( ) that displays which gerbil number this is, and that it’s hopping.
//Create an ArrayList and add Gerbil objects to the List.
//Now use the get( ) method to move through the List and call hop( ) for each Gerbil.
//Exercise 8:Modify Exercise l so it uses an Iterator to move through the List while calling hop( ).
//Exercise 17:Take the Gerbil class in Exercise 1 and put it into a Map instead, associating each Gerbil’s name (e.g. "Fuzzy" or "Spot") as a String (the key) for each Gerbil (the value) you put in the table.
// Get an Iterator for the keySet( ) and use it to move through the Map, looking up the Gerbil for each key and printing out the key and telling the Gerbil to hop( ).
public class Gerbil {
    int gerbilNumber;

    Gerbil(int num) {
        this.gerbilNumber = num;
    }

    public String toString() {
        return "Gerbil ";
    }

    void hop() {
        System.out.println("Gerbil " + gerbilNumber + " is hopping");
    }

    public static void main(String[] args) {
        Map<String, Gerbil> gerbilList = new HashMap<>();
        gerbilList.put("Fuzzy", new Gerbil(1));
        gerbilList.put("Spot", new Gerbil(2));
        gerbilList.put("Perry", new Gerbil(3));
        gerbilList.put("Garfield", new Gerbil(4));
        Iterator<String> it = gerbilList.keySet().iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.print(s + " :");
            gerbilList.get(s).hop();
        }

    }
}
