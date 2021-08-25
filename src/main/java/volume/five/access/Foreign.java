package volume.five.access;
//Exercise 9: Create the following file in the access/local directory (presumably in your CLASSPATH):
//Explain why the compiler generates an error.
// Would making the Foreign class part of the access.local package change anything?
//The answer is "Yes"

import volume.five.access.local.*;

public class Foreign {
    public static void main(String[] args) {
        //  PackagedClass pc = new PackagedClass(); //can't access because the class is in another package
    }
}
