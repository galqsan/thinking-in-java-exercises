package volume.ten;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

//Exercise 28:Fill a PriorityQueue (using offer( )) with Double values created using java.util.Random, then remove the elements using poll( ) and display them.
public class ExerciseTwentyEight {
    public static void printAndDeleteQ(Queue<?> queue) {
        while (queue.peek() != null) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Random rand = new Random();
        PriorityQueue<Double> priorityQ = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            priorityQ.offer(rand.nextDouble());
        }
        printAndDeleteQ(priorityQ);


    }
}
