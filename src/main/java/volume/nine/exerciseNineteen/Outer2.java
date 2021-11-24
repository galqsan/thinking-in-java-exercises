package volume.nine.exerciseNineteen;

public class Outer2 {
    static class StaticInner1 {
        static class StaticInner2 {
            void v() {
                System.out.println("StaticInner2.v()");
            }
        }

        void v() {
            System.out.println("StaticInner1.v()");
        }
    }

}
