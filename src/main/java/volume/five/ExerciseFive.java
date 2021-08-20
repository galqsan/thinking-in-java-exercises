package volume.five;
//Exercise 5:Create a class with public, private, protected, and package-access fields and method members.
// Create an object of this class and see what kind of compiler messages you get when you try to access all the class members.
// Be aware that classes in the same directory are part of the “default” package.

class AccessControl {
    public String p = "public";

    public void f() {
        System.out.println("public access");
    }

    protected String s = "protected";

    protected void c() {
        System.out.println("protected access");
    }

    String string = "package-access";

    void ff() {
        System.out.println("package-access");
    }

    private String i = "private";

    private void b() {
        System.out.println("private access");
    }
}

public class ExerciseFive {
    public static void main(String[] args) {
        AccessControl accessControl = new AccessControl();
        System.out.println(accessControl.s);
        System.out.println(accessControl.p);
        System.out.println(accessControl.string);
        accessControl.f();
        accessControl.ff();
        accessControl.c();
        // accessControl.b();//Can’t access, because it is private
        // System.out.println(accessControl.i);//Can’t access, because it is private
    }
}
