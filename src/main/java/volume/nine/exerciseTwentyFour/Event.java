package volume.nine.exerciseTwentyFour;

public abstract class Event {
    private long eventTime;
    protected final long delayTime;

    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    void start() { // Allows restarting
        eventTime = System.nanoTime() + delayTime;
    }

    boolean ready() {
        return System.nanoTime() >= eventTime;
    }

    public abstract void action();
}