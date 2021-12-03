package volume.nine;

//Exercise 21:Create an interface that contains a nested class that has a static method that calls the methods of your interface and displays the results.
// Implement your interface and pass an instance of your implementation to the method.
public interface Ex21Interface {
    String interfaceMethod(String s);

    class NestedClass implements Ex21Interface {

        @Override
        public String interfaceMethod(String s) {
            return s;
        }

        static void printInterfaceMethod(Ex21Interface i) {
            System.out.println(i.interfaceMethod("NestedClass.printInterfaceMethod()"));
        }

        public static void main(String[] args) {
            printInterfaceMethod(new NestedClass());
        }
    }
}
