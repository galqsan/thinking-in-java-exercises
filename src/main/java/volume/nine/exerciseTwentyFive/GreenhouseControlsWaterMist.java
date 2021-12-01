package volume.nine.exerciseTwentyFive;

import volume.nine.exerciseTwentyFour.Event;
import volume.nine.exerciseTwentyFour.*;

public class GreenhouseControlsWaterMist extends GreenhouseControls {
    private boolean waterMistGenerator = false;

    public class MistGeneratorOn extends Event {
        MistGeneratorOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            waterMistGenerator = true;
        }

        public String toString() {
            return "The Mist Generator is on";
        }
    }

    public class MistGeneratorOff extends Event {
        MistGeneratorOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            waterMistGenerator = false;
        }

        public String toString() {
            return "The Mist Generator is off";
        }
    }

}
