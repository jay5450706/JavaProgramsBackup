package mypackage;

import java.util.Arrays;

public class JavaTwoDArrays {
    public static void main(String[] args) {
        int[][] numbers = {
            {21, 24},
            {31, 95},
            {77, 66}
        };

        System.out.println(numbers.length); //the length of the 1D array that holds the addresses of other 1D arrays(rows)
        System.out.println(numbers[0].length); //length of first 1D array(columns)
        
        System.out.println("Printing indices row by row");

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++)
                System.out.print("numbers[" + i + "]" + "[" + j + "]" + " ");
        System.out.println();
        }
        
        System.out.println("Printing row by row");

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++)
                System.out.print(numbers[i][j] + " ");
        System.out.println();
        }
        
        System.out.println("Printing column by column");
        
        for(int i = 0; i < numbers[i].length; i++){
            for(int j = 0; j < numbers.length; j++)
            System.out.print(numbers[j][i] + " ");
            System.out.println();
        }
        
        System.out.println("Printing by toString method");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.deepToString(numbers));
        
        System.out.println("Ragged Arrays");
        int[][] integers = {
            {1,2,3},
            {7,8, 9, 10, 4},
            {5,6},
            {2},
        };
        
        System.out.println("The length of rows: " + integers.length);
        System.out.println("The length of 1st 1D array: " + integers[0].length);
        System.out.println("The length of 2nd 1D array: " + integers[1].length);
        System.out.println("The length of 3rd 1D array: " + integers[2].length);

        System.out.println("Printing Ragged Array row by row");
    
        for(int i = 0; i < integers.length; i++){
            for(int j = 0; j < integers[i].length; j++)//integers[i] is important here since array is ragged
            //cannot use integers[0] or integers[1] and so on
                System.out.print(integers[i][j] + " ");
        System.out.println();
        }

        System.out.println("Printing Ragged Array Column by Column");

        int max_length = 0;

        for(int i = 0; i < integers.length;i++){

            if (integers[i].length > max_length) {
                max_length = integers[i].length;
                System.out.println(max_length);
            }
        }
        for(int i = 0; i < max_length;i++){
            for(int j = 0; j < integers.length; j++){
                if(i >= integers[j].length) 
                continue;
                System.out.print(integers[j][i] + " ");
            }
            System.out.println();
        }

    }
}
