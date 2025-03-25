package mypackage;

public class JavaInnerClass {
    public static void main(String[] args) {
        Outer outerObj = new Outer();

        outerObj.toString();
        Outer.Inner innerObj = new Outer.Inner();

        innerObj.showX();
        
        Outer.Inner.number = 29;

    }
}