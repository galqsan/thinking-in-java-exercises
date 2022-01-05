package volume.ten;

import java.util.LinkedList;
import java.util.Queue;

//Exercise 27:Write a class called Command that contains a String and has a method operation( ) that displays the String. Write a second class with a method that fills a Queue with Command objects and returns it.
// Pass the filled Queue to a method in a third class that consumes the objects in the Queue and calls their operation( ) methods.
class Command {
    String s;

    Command(String s) {
        this.s = s;
    }

    public void operation() {
        System.out.println(s);
    }
}

class Ex27 {

    public static Queue<Command> fillQ(Queue<Command> q, int c) {
        for (int i = 0; i < c; i++) {
            q.add(new Command("Command:" + i));
        }
        return q;
    }
}

public class ExerciseTwentySeven {
    public static void qConsumer(Queue<Command> queue) {

        while (queue.peek() != null) {
            queue.remove().operation();
        }
    }

    public static void main(String[] args) {
        Queue<Command> queue = new LinkedList<>();
        queue = Ex27.fillQ(queue, 5);
        ExerciseTwentySeven.qConsumer(queue);
    }
}
