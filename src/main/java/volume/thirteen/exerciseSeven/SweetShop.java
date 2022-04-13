package volume.thirteen.exerciseSeven;

import static net.mindview.util.Print.print;

/*Exercise 7: Modify SweetShop.java so that each type of object creation is
controlled by a command-line argument. That is, if your command line is "Java Sweetshop
Candy," then only the Candy object is created. Notice how you can control which Class
objects are loaded via the commandline argument.*/
class Candy {
    static {
        print("Loading Candy");
    }
}

class Gum {
    static {
        print("Loading Gum");
    }
}

class Cookie {
    static {
        print("Loading Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) throws Exception {
        for (String arg : args) {
            Class.forName(arg);
        }
    }
}
