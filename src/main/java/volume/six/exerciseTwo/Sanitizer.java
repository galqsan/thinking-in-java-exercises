package volume.six.exerciseTwo;

//Exercise 2:Inherit a new class from class Detergent. Override scrub( ) and add a new method called sterilize( ).
public class Sanitizer extends Detergent {
    public void scrub() {
        append(" sanitizer.scrub()");
        super.scrub();
    }

    public void sterilize() {
        append(" sterilize ()");
    }

    public static void main(String[] args) {
        Sanitizer sanitizer = new Sanitizer();
        sanitizer.scrub();
        sanitizer.foam();
        sanitizer.dilute();
        sanitizer.apply();
        sanitizer.sterilize();
        System.out.println(sanitizer);
    }
}
