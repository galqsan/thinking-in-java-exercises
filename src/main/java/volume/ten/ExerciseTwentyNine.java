package volume.ten;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

//Exercise 29: Create a simple class that inherits from Object and contains no members, and show that you cannot successfully add multiple elements of that class to a PriorityQueue.
// This issue will be fully explained in the Containers in Depth chapter.
class Ex29 {
}

public class ExerciseTwentyNine {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.offer(new Ex29());
        //  priorityQueue.offer(new Ex29());
        //The PriorityQueue give ClassCastException when the program is run ,because the object cannot be compared
    }

}
