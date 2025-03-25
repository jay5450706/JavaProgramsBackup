package mypackage;

import java.awt.Point;

/*
 * Demonstrating that strings are immutable
 */

public class PassByReference {

    static String name = "James";
    
    public static void main(String[] args) {
        int a = 5;
        System.out.println(System.identityHashCode(a));
        changeName(PassByReference.name);

        System.out.println(name);

        Point p = new Point();
        p.x = 2;
        p.y = 3;
        changePoint(p);

        System.out.println(p.x + " " + p.y);

    }
    
    public static void changeName(String newName){
        System.out.println(PassByReference.name == newName);
        System.out.println(System.identityHashCode(name));
        System.out.println(System.identityHashCode(newName));
        newName = "Samson";
        System.out.println(newName);
        System.out.println(PassByReference.name == newName);
        System.out.println(System.identityHashCode(name));
        System.out.println(System.identityHashCode(newName));
    }
    
    public static void changePoint(Point p2){
        p2.x = 23;
        p2.y = 50;
    }
}
// int[] numbers;
// numbers = new int[10];

// int integers[] = {5,7,6,8};

// integers[1] = 14;

// System.out.println(integers[1]);

// System.out.println(integers.length);

// for(int i = 0; i < integers.length; i++){System.out.print(integers[i] + " ");}