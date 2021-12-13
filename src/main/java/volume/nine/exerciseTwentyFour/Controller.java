package volume.nine.exerciseTwentyFour;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//Volume 10:Exercise 13:In the innerclasses/GreenhouseController.java example, the class Controller uses an ArrayList.
// Change the code to use a LinkedList instead, and use an Iterator to cycle through the set of events.
public class Controller {
    // A class from java.util to hold Event objects:
    private List<Event> eventList = new LinkedList<>();

    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        while (eventList.size() > 0) {
// Make a copy so you’re not modifying the list
// while you’re selecting the elements in it:
            Iterator<Event> it = new LinkedList<>(eventList).iterator();
            while (it.hasNext()) {
                Event e = it.next();
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    it.remove();
                }
            }
        }
    }
}