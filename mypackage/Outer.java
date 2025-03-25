package mypackage;

public class Outer {
    private int outerX;

   static class Inner{
        private int innerX;
        static int number;

        void showX(){
            System.out.println("OuterX is: " + new Outer().outerX + "InnerX is: " + innerX);
        }
    }

    int getOuterX(){
        return outerX;
    }
}
