package anotherpackage;
import mypackage.Rectangle;

public class LambdaExpressions {
    private static double instanceVar = 20;
    public static void main(String[] args) {
        int localVar = 10;

        MyNumber add = (n, m) -> m + n;

        int n = (int)add.getValue(2, 3);
        
        System.out.println("The value of n " + n);
        System.out.println(add.getValue(7, 8));

        Method<String> upper = (str) -> {
            return str.toUpperCase();
        };

        System.out.println("apples in uppercase is: " + upper.function("apples"));

        Method<Integer> square = (arg) -> {
            return arg*arg;
        };

        System.out.println("The square of 9 is: " + square.function(9));

        Method<Rectangle> change = rect -> {
            System.out.println("Before Change: Hieght: " + rect.getHeight() + " Width: " + rect.getWidth());
            rect.setHeight(20);
            rect.setWidth(10);
            return rect;
        };

        System.out.println("After Change: " + change.function(new Rectangle(2,4)));

        //Demostrating variable capture
        MyNumber value = (num, num2) -> {
            return num + num2 + localVar + instanceVar;
        };

        System.out.println(value.getValue(10, 20)); //60.0

        //Local variable localVar is required to be final or effectively final based on its usage
        //localVar = 45;

        //no problem here
        instanceVar = 50;

    }


}
