package volume.ten.exerciseOne;


import java.util.ArrayList;
import java.util.Iterator;

//Exercise 1:Create a new class called Gerbil with an int gerbilNumber that’s initialized in the constructor.
//Give it a method called hop( ) that displays which gerbil number this is, and that it’s hopping.
//Create an ArrayList and add Gerbil objects to the List.
//Now use the get( ) method to move through the List and call hop( ) for each Gerbil.
//Exercise 8:Modify Exercise l so it uses an Iterator to move through the List while calling hop( ).
public class Gerbil {
    int gerbilNumber;

    Gerbil(int num) {
        this.gerbilNumber = num;
    }

    void hop() {
        System.out.println("Gerbil " + gerbilNumber + " is hopping");
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbilList = new ArrayList<>();
        Iterator<Gerbil> it = gerbilList.iterator();
        for (int i = 0; i < 4; i++)
            gerbilList.add(new Gerbil(i));
        while (it.hasNext()) {
            it.next().hop();
        }

    }
}
