package volume.seven;

//Exercise 16:Following the example in Transmogrify.java, create a Starship class containing an AlertStatus reference that can indicate three different states.
// Include methods to change the states.!!
class AlertStatus {
    public void status() {
    }
}

class RedStatus extends AlertStatus {
    public void status() {
        System.out.println("Red Status");
    }
}

class YellowStatus extends AlertStatus {
    public void status() {
        System.out.println("Yellow Status");
    }
}

class GreenStatus extends AlertStatus {
    public void status() {
        System.out.println("Greed Status");
    }
}

public class Starship {
    private AlertStatus status = new RedStatus();

    void change(char a) {
        if (a == 'y') {
            status = new YellowStatus();
        } else if (a == 'r') {
            status = new RedStatus();
        } else if (a == 'g') {
            status = new GreenStatus();
        } else {
            System.out.println("Wrong letter");
        }

    }

    void displayStatus() {
        status.status();
    }

    public static void main(String[] args) {
        Starship starship = new Starship();
        starship.displayStatus();
        starship.change('g');
        starship.displayStatus();
    }
}
