package volume.six.exerciseTwo;

//Exercise 11:  Modify Detergent.java so that it uses delegation.
class Cleanser {
    private String s = "Cleanser";

    void append(String a) {
        s += a;
    }

    void dilute() {
        append(" dilute()");
    }

    void apply() {
        append(" apply()");
    }

    void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}

public class Detergent {
    private String d = "Detergent";
    Cleanser cleanse = new Cleanser();

    public void scrub() {
        append(" Detergent.scrub()");
        cleanse.scrub(); // Call base-class version
    }

    public void append(String a) {
        d += a;
    }

    public void foam() {
        append(" foam()");
    }

    public void dilute() {
        cleanse.dilute();
    }

    public void apply() {
        cleanse.apply();
    }

    public String toString() {
        return d + " " + cleanse;
    }


    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}
