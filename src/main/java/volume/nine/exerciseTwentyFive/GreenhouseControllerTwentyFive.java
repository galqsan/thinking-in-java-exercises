package volume.nine.exerciseTwentyFive;

import volume.nine.exerciseTwentyFour.*;

//Exercise 25:Inherit from GreenhouseControls in GreenhouseControls.java to add Event inner classes that turn water mist generators on and off.
// Write a new version of GreenhouseController.java to use these new Event objects.
public class GreenhouseControllerTwentyFive {
    public static void main(String[] args) {
        GreenhouseControlsWaterMist gc = new GreenhouseControlsWaterMist();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new FansOn(300),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new FansOff(900),
                gc.new ThermostatDay(1400),
                gc.new MistGeneratorOn(1600),
                gc.new MistGeneratorOff(1800)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        gc.addEvent(new GreenhouseControlsWaterMist.Terminate(1));
        gc.run();
    }
}