package volume.one;
//In the Initialization & Cleanup chapter, locate the Overloading.java example and add Javadoc documentation.
// Extract this comment documentation into an HTML file using Javadoc and view it with your Web browser.
//: initialization/Overloading.java
// Demonstration of both constructor
// and ordinary method overloading.


import static jdk.nashorn.internal.objects.Global.print;

/**
 * class tree
 */
class Tree {
    int height;
    /** default constructor */

    Tree() {
        print("Planting a seedling");
        height = 0;
    }
/** constructor with parameter */
    Tree(int initialHeight) {
        height = initialHeight;
        print("Creating new Tree that is " +
                height + " feet tall");
    }
/** Methods printing the height  */
    void info() {
        print("Tree is " + height + " feet tall");
    }

    void info(String s) {
        print(s + ": Tree is " + height + " feet tall");
    }

}
/** Exercise sixteen */
public class Overloading {

    public static void main(String[] args) {
        /**creating a loop in main method  */
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
// Overloaded constructor:
        new Tree();
    }
} /* Output:
Creating new Tree that is 0 feet tall
Tree is 0 feet tall
overloaded method: Tree is 0 feet tall
Creating new Tree that is 1 feet tall
Tree is 1 feet tall
overloaded method: Tree is 1 feet tall
Creating new Tree that is 2 feet tall
Tree is 2 feet tall
overloaded method: Tree is 2 feet tall
Creating new Tree that is 3 feet tall
Tree is 3 feet tall
overloaded method: Tree is 3 feet tall
Creating new Tree that is 4 feet tall
Tree is 4 feet tall
overloaded method: Tree is 4 feet tall
Planting a seedling
*///:~