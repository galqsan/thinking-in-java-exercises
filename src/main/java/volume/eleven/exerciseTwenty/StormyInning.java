package volume.eleven.exerciseTwenty;

//Exercise 20: Modify StormyInning.java by adding an UmpireArgument exception type and methods that throw this exception.
// Test the modified hierarchy.
//Exercise 29:  Modify all the exception types in StormyInning.java so that they
//extend RuntimeException, and show that no exception specifications or try blocks are
//necessary. Remove the "//!" comments and show how the methods can be compiled without
//specifications.
class BaseballException extends RuntimeException {
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
    }

    public abstract void atBat() throws Strike, Foul, UmpireArgument;

    abstract void someOtherEvent() throws UmpireArgument;

    public void walk() {
    }
}

class StormException extends RuntimeException {
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
        StormyInning si = new StormyInning();
        System.out.println("First try");
        si.atBat();
        System.out.println("Second try");
        Inning i = new StormyInning();
        i.atBat();
        System.out.println("try number three");
        si.atBat();
        si.someOtherEvent();
    }
}