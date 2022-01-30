package volume.eleven.exerciseFifteen;

import volume.eleven.exerciseFourteen.OnOffException1;
import volume.eleven.exerciseFourteen.OnOffException2;
import volume.eleven.exerciseFourteen.OnOffSwitch;
import volume.eleven.exerciseFourteen.Switch;

//Exercise 15:Show that WithFinally.java doesn’t fail by throwing a RuntimeException inside the try block.
public class WithFinally {
    static Switch sw = new Switch();
    public static void main(String[] args) {
        try {


            try {
                sw.on();
// Code that can throw exceptions...
                OnOffSwitch.f();
            } catch (OnOffException1 e) {
                System.out.println("OnOffException1");
            } catch (OnOffException2 e) {
                System.out.println("OnOffException2");
            } finally {
                sw.off();
            }
        }catch (RuntimeException e){
            System.out.println("The switch is "+sw);
        }
    }
}