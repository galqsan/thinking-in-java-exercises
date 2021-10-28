package volume.seven.exerciseSix;

import java.util.Random;

//Exercise 6:Change Music3.java so that what( ) becomes the root Object method toString( ).
//Try printing the Instrument objects using System.out.println( ) (without any casting).
//Exercise 7:Add a new type of Instrument to Music3.java and verify that polymorphism works for your new type.
//Exercise 8:Modify Music3.java so that it randomly creates Instrument objects the way Shapes.java does.
//Volume 8:Exercise 9:Refactor Musics.java by moving the common methods in Wind, Percussion and Stringed into an abstract class.
//Volume 8:Exercise 10:Modify Musics.java by adding a Playable interface.
// Move the play( ) declaration from Instrument to Playable.
// Add Playable to the derived classes by including it in the implement s list.
// Change tune( ) so that it takes a Playable instead of an Instrument.
abstract class Instrument {
    public String toString() {
        return "Instrument";
    }

    abstract void adjust();
}

interface Playable {
    void play(Note n);
}

class Wind extends Instrument implements Playable {
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    public String toString() {
        return "Wind";
    }

    void adjust() {
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument implements Playable {
    public void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    public String toString() {
        return "Percussion";
    }

    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Stringed extends Instrument implements Playable {
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    public String toString() {
        return "Stringed";
    }

    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Brass extends Wind implements Playable {
    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class Woodwind extends Wind {
    public void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    public String toString() {
        return "Woodwind";
    }
}

class Violin extends Stringed {
    public void play(Note n) {
        System.out.println("Violin.play() " + n);
    }

    void adjust() {
        System.out.println("Adjusting Violin");
    }

    public String toString() {
        return "Violin";
    }
}

public class Music3 {
    // Doesn’t care about type, so new types
// added to the system still work right:
    public static void tune(Playable p) {
// ...
        p.play(Note.MIDDLE_C);
    }

    Random random = new Random(47);

    public Instrument next() {
        switch (random.nextInt(6)) {
            default:
            case 0:
                return new Wind();
            case 1:
                return new Stringed();
            case 2:
                return new Percussion();
            case 3:
                return new Brass();
            case 4:
                return new Woodwind();
            case 5:
                return new Violin();

        }
    }

    public static void tuneAll(Playable[] e) {
        for (Playable i : e)
            tune(i);
    }

    public static void main(String[] args) {
        Music3 m = new Music3();
        Instrument[] instruments = new Instrument[10];
// Upcasting during addition to the array:
        Playable[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new Violin()
        };
        tuneAll(orchestra);
        Wind w = new Wind();
        Percussion p = new Percussion();
        Stringed s = new Stringed();
        Brass b = new Brass();
        Woodwind woodwind = new Woodwind();
        System.out.println(w);
        System.out.println(p);
        System.out.println(s);
        System.out.println(b);
        System.out.println(woodwind);
        System.out.println("Random instruments!!");
        for (int i = 0; i < instruments.length; i++) {
            instruments[i] = m.next();
        }
        for (Instrument ins : instruments)
            System.out.println(ins);
    }
}