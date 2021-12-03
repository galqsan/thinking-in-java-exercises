package volume.eight.exerciseNineteen;

import java.util.Random;

//Exercise 19:Create a framework using Factory Methods that performs both coin tossing and dice tossing.
//Volume 9:Exercise 17:Modify the solution to Exercise 19 from the Interfaces chapter to use anonymous inner classes.
interface Game {
    void toss();
}

interface GameFactory {
    Game getGame();
}

class CoinGame implements Game {
    private CoinGame() {
    }

    private Random rand = new Random();

    @Override
    public void toss() {
        System.out.println("Coin toss " + rand.nextBoolean());
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new CoinGame();
        }
    };
}

class DiceGame implements Game {
    private DiceGame() {
    }

    private Random rand = new Random();

    @Override
    public void toss() {
        System.out.println("Dice toss :" + rand.nextInt(7));
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new DiceGame();
        }
    };
}

public class Games {
    public static void tossing(GameFactory factory) {
        Game game = factory.getGame();
        game.toss();
    }

    public static void main(String[] args) {
        tossing(DiceGame.factory);
        tossing(CoinGame.factory);
    }
}
