package volume.six;

//Exercise 3:Prove the previous sentence.
class Art {
    Art() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}

public class Cartoon extends Drawing {
    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}