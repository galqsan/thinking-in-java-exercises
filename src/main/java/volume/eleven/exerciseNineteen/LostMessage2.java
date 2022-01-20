package volume.eleven.exerciseNineteen;

import volume.eleven.exerciseEighteen.LostMessage;

//Exercise 19: Repair the problem in LostMessage.java by guarding the call in the finally clause.
public class LostMessage2 {
    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                try {
                    lm.dispose();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}