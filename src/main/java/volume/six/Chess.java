package volume.six;

//Exercise 6: Using Chess.java, prove the statements in the previous paragraph.
class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}

public class Chess extends BoardGame {
    Chess() {
        super(11);// If the constructor of the base class is not the first think called in the constructor of the deprived class, it give a error.
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        new Chess();
    }
}

