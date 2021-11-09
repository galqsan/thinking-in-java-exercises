package volume.eight;

//Exercise 13: Create an interface, and inherit two new interfaces from that interface.
// Multiply inherit a third interface from the second two.
interface ExThirteen1 {
    void v();
}

interface ExThirteen2 extends ExThirteen1 {
    void v();
}

interface ExThirteen3 extends ExThirteen1 {
    void v();
}

interface ExThirteen4 extends ExThirteen2, ExThirteen3 {
    void v();
}

public class ExThirteen implements ExThirteen4 {
    public void v() {
        System.out.println("ExThirteen.v()");
    }

    public static void main(String[] args) {
        new ExThirteen().v();
    }
}
