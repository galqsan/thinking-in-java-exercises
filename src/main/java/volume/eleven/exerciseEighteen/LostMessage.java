package volume.eleven.exerciseEighteen;

//Exercise 18:Add a second level of exception loss to LostMessage.java so that the HoHumException is itself replaced by a third exception.
class VeryImportantException extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}

class ReplaceHoHumException extends Exception {
    public String toString() {
        return " Replacing the trivial exception ";
    }
}

public class LostMessage {
    public void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void h() throws ReplaceHoHumException {
        throw new ReplaceHoHumException();
    }

    public void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();

            try {
                try {
                    lm.f();
                } finally {
                    lm.dispose();
                }
            } finally {
                lm.h();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}