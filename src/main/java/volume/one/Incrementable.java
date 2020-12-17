package volume.one;

public class Incrementable /*Ex7*/ {
    static void increment() { StaticTest.i++; }

    public static void main(String[] args) {
        Incrementable.increment();
    }

    static class StaticTest {
        static int i = 47;
    }
}