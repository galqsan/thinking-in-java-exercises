package volume.eight.exerciseEleven;

//Exercise 11:Create a class with a method that takes a String argument and produces a result that swaps each pair of characters in that argument.
// Adapt the class so that it works with interfaceprocessor.Apply.process( ).
class Swaper {
    public String swap(Object input) {
        StringBuilder sb = new StringBuilder(((String) input));
        for (int i = 0; i < sb.length() - 1; i += 2) {
            char ch = sb.charAt(i);
            char ch2 = sb.charAt(i + 1);
            sb.setCharAt(i, ch2);
            sb.setCharAt(i + 1, ch);
        }
        return sb.toString();
    }
}

class SwapAdapter extends Processor {
    public String name() {
        return Swaper.class.getSimpleName();
    }

    public String process(Object input) {
        Swaper swaper = new Swaper();
        return swaper.swap((String) input);
    }
}

public class SwapProcessor {
    public static String s = "If she weighs the same as a duck, she’s made of wood";

    public static void main(String[] args) {
        Apply.process(new SwapAdapter(), s);
        Apply.process(new SwapAdapter(), "54674");
    }
}

