package volume.nine.exerciseFourteen;

//Exercise 14:Modify interfaces/HorrorShow.java to implement DangerousMonster and Vampire using anonymous classes.
interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

class DragonZilla implements DangerousMonster {
    public void menace() {
    }

    public void destroy() {
    }
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

public class HorrorShow {
    public static Vampire vampires() {
        return new Vampire() {
            @Override
            public void drinkBlood() {
            }

            @Override
            public void destroy() {
            }

            @Override
            public void kill() {
            }

            @Override
            public void menace() {
            }
        };
    }

    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    static void w(Lethal l) {
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney = new DangerousMonster() {
            @Override
            public void destroy() {
            }

            @Override
            public void menace() {
            }
        };
        u(barney);
        v(barney);
        Vampire vlad = vampires();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}