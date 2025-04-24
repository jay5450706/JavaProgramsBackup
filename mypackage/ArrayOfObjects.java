/*
 * Demonstrates how to create and print array and array list of objects
 */

package mypackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Rectangle[] rectArrayObj = new Rectangle[3];

        Scanner input = new Scanner(System.in);

        //get values for each rectangle object from the user
        //using for loop
        for(int i = 0; i < rectArrayObj.length; i++){
            System.out.print("Enter the height following width for rectangle [" + (i+1) + "]: " );
            rectArrayObj[i] = new Rectangle(input.nextDouble(), input.nextDouble());
        }

        System.out.println();

        //print the height and width of the rectangles
        //using for loop
        System.out.println("Height and width of rectangles using for loop");
        for(int i = 0; i < rectArrayObj.length; i++){
            System.out.println("Rectangle " + (i+1) + " Height: " + rectArrayObj[i].getHeight()
            + " Width: " + rectArrayObj[i].getWidth() + " ");

        }
        System.out.println();

        //print the height and width the for each style
        System.out.println("Rectangles Width and Height the for each style loop");
        int i = 1;
        for(Rectangle rectRef:rectArrayObj){
            System.out.println("Rectangle " + i + " Height: " + rectRef.getHeight()
            + " Width: " + rectRef.getWidth() + " ");
            i++;
        }

        //using ArrayList
        
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        System.out.println();

        //j < 3 is appropriate rectangles array list size is initially 0
        for(int j = 0; j < 3; j++){
            System.out.print("Enter the height then width of Rectangle " + (j+1) + ": ");
            rectangles.add(new Rectangle(input.nextDouble(),input.nextDouble()));
        }

        System.out.println();
        System.out.println("Printing using For Loop");
        for(int j = 0; j < rectangles.size();j++){
            System.out.println("Rectangle " + (j+1) + ": " + "Width: " + rectangles.get(j).getWidth() 
            + " Height: " + rectangles.get(j).getHeight());
        }

        System.out.println();
        System.out.println("For Each Style Loop");
        
        int j = 1;
        for(Rectangle rect:rectangles){
            System.out.println("Rectangle " + j + ": " + "Width: " + rect.getWidth() + " Height: " + rect.getHeight());
            j++;
        }

        input.close();
    }
    
}
