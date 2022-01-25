package volume.eleven.exerciseTwenty;

//Exercise 20: Modify StormyInning.java by adding an UmpireArgument exception type and methods that throw this exception.
// Test the modified hierarchy.
class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

class UmpireArgument extends BaseballException {
}

abstract class Inning {
    public Inning() throws BaseballException {
    }

    public void event() throws BaseballException {
// Doesn’t actually have to throw anything
    }

    public abstract void atBat() throws Strike, Foul, UmpireArgument;

    abstract void someOtherEvent() throws UmpireArgument;

    public void walk() {
    }
}


class StormException extends Exception {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

interface Storm {
    public void event() throws RainedOut;

    public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {
    public StormyInning()
            throws RainedOut, BaseballException {
    }

    public StormyInning(String s)
            throws Foul, BaseballException {
    }

    public void rainHard() throws RainedOut {
    }

    public void event() {
    }

    public void atBat() throws PopFoul, UmpireArgument {
        throw new UmpireArgument();
    }

    @Override
    void someOtherEvent() throws UmpireArgument {
        throw new UmpireArgument();
    }

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            System.out.println("First try");
            si.atBat();
        } catch (PopFoul e) {
            System.out.println("Pop foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
        try {
            System.out.println("Second try");
            Inning i = new StormyInning();
            i.atBat();
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
        try {
            System.out.println("try number three");
            StormyInning si = new StormyInning();
            si.atBat();
            si.someOtherEvent();
        } catch (UmpireArgument e) {
            System.out.println(
                    "Umpire Argument");
        } catch (PopFoul e) {
            System.out.println("Pop Foul");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        }
    }
}