package volume.eight.exerciseNineteen;

import java.util.Random;

//Exercise 19:Create a framework using Factory Methods that performs both coin tossing and dice tossing.
interface Game {
    void toss();
}

interface GameFactory {
    Game getGame();
}

class CoinGame implements Game {
    private Random rand = new Random(47);

    @Override
    public void toss() {
        System.out.println("Coin toss " + rand.nextBoolean());
    }
}

class CoinGameFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new CoinGame();
    }
}

class DiceGame implements Game {
    private Random rand = new Random(47);

    @Override
    public void toss() {
        System.out.println("Dice toss :" + rand.nextInt(7));
    }
}

class DiceGameFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new DiceGame();
    }
}

public class Games {
    public static void tossing(GameFactory factory) {
        Game game = factory.getGame();
        game.toss();
    }

    public static void main(String[] args) {
        tossing(new DiceGameFactory());
        tossing(new CoinGameFactory());
    }
}
