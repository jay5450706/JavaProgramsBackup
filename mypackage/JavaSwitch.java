package mypackage;

import java.util.Scanner;

public class JavaSwitch {
    public static void main(String[] args) throws java.io.IOException {
        String name = new Scanner(System.in).nextLine();
        System.out.println(name);

        char choice = (char)System.in.read();

        System.out.println(choice);

        for(int a=1, b = 4; a < b; a++, b--){
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

        int[][] numbers = new int[2][];
        numbers[0] = new int[3];
    }
}
