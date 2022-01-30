package volume.eleven.exerciseThirty;

//Exercise 30: Modify Human.java so that the exceptions inherit from
//RuntimeException. Modify main( ) so that the technique in TurnOffChecking.java is
//used to handle the different types of exceptions.
class Annoyance extends RuntimeException {
}

class Sneeze extends Annoyance {
}

public class Human {
    static void throwRuntimeException(int type) {
        try {
            switch (type) {
                case 0:
                    throw new Annoyance();
                case 1:
                    throw new Sneeze();
                default:
                    return;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 2; i++) {
                throwRuntimeException(i);
            }
        } catch (RuntimeException re) {
            try {
                throw re.getCause();
            } catch (Sneeze s) {
                System.out.println("Caught Sneeze");
            } catch (Annoyance a) {
                System.out.println("Caught Annoyance");
            } catch (Throwable e) {
                System.out.println("Throwable: " + e);
            }
        }
    }
}