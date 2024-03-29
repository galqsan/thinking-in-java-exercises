package volume.nine.exerciseTwentyFour;

//Exercise 24:In GreenhouseControls.java, add Event inner classes that turn fans on and off.
// Configure GreenhouseController.java to use these new Event objects.
public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
// Instead of hard-wiring, you could parse
// configuration information from a text file here:
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new FansOn(300),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new FansOff(900),
                gc.new ThermostatDay(1400)

        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length == 1)
            gc.addEvent(
                    new GreenhouseControls.Terminate(
                            new Integer(args[0])));
        gc.run();
    }
}
