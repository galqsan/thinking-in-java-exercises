package volume.one.eleven;

public class Executor {
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow allTheColorsOfTheRainbow = new AllTheColorsOfTheRainbow();
        System.out.println("Color before change:" + allTheColorsOfTheRainbow.anIntegerRepresentingColors);
        System.out.println("Hue before change: " + allTheColorsOfTheRainbow.hue);
        allTheColorsOfTheRainbow.changeColor(6);
        allTheColorsOfTheRainbow.changeTheHueOfTheColor(2);
        System.out.println("Color after change:" + allTheColorsOfTheRainbow.anIntegerRepresentingColors);
        System.out.println("Hue after change :" + allTheColorsOfTheRainbow.hue);

    }
}
