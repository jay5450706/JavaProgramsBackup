package mypackage;

import java.util.Scanner;

public class JavaArrays {
    public static void main(String[] args) {
        int[] numbers = getNumbers();
                printArray(numbers);
            }
        
    public static int[] getNumbers() {
        int[] integers = new int[4];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 4 integers: ");

        for(int i = 0; i < integers.length; i++){
            integers[i] = input.nextInt();
        }

        input.close();

        return integers;
        
    }

    public static void printArray(int[] arrayName){
        for(int i = 0; i < arrayName.length; i++){
            System.out.print(arrayName[i] + " ");
        }
    }
    
    public static void printArray(String[] arrayName){
        for(int i = 0; i < arrayName.length; i++){
            System.out.print(arrayName[i] + " ");
        }
    }
}
