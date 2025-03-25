package mypackage;

//import java.util.Arrays;

public class JavaThreeDArrays {
    public static void main(String[] args) {
      
     
        // /*
        //  * 3 2d arrays, each 2d array has 4 1d arrays(rows) of 5 elements(columns)
        //  * 
        //  */
        // int[][][] threeD = new int[3][4][5]; 


        // System.out.println(threeD.length);//number of 2d arrays, 3
        // System.out.println(threeD[0].length);//length of 1st 2d arrays, number of rows of 1st 2d array, 4
        // System.out.println(threeD[0][0].length);//length of 1st 1d array of 1st 2d array, 
        // //number of columns of 1st 1d array of 1st 2d array, 5

        

        // int[][][] array2 = {

        //     {
        //         {10, 11, 12, 13, 14}, //row 1
        //         {22, 23, 24, 25, 26}, //row 2
        //         {30, 31, 32, 33, 35}, //row 3
        //         {40, 41, 42, 43, 44} //row 4
                
        //     }, //1st 2d
            
        //     {
                
        //         {10, 11, 12, 13, 14}, //row 1
        //         {22, 23, 24, 25, 26}, //row 2
        //         {30, 31, 32}, //row 3
        //         {40, 41, 42, 43, 44} //row 4

        //     }, //2nd 2d
            
        //     {
        //         {10, 11, 12, 13, 14}, //row 1
        //         {22, 23, 24, 25, 26}, //row 2
        //         {30, 31, 32, 33, 35}, //row 3
        //         {40, 41, 42, 43, 44} //row 4

        //     } //3rd
        // };

        // System.out.println(array2[2][3][4]);
        // array2[2][3][4] = 555;
        // System.out.println(array2[2][3][4]);

        // //System.out.println(Arrays.deepToString(array2));
        // /*
        //  * array2[0].length length of first 2d array , array2[1].length length of 2nd 2d array
        //  * 
        //  */
        // for(int i = 0; i < array2.length;i++){
        //     for(int j = 0; j < array2[i].length;j++){
        //         for(int k = 0; k < array2[i][j].length;k++){
        //             System.out.print(array2[i][j][k] + " ");
        //         }
        //     System.out.println();
        //     }
        //     System.out.println();
        // }

        int[][][] numbers = new int[2][][];
        //int[][][] numbers2 = new int[2][3][];
        
        numbers[0] = new int[2][]; //allocating memory to first 2d array

        numbers[0][0] = new int[3]; // allocating memory to first 1d array

        numbers[0][1] = new int[2]; //allocating memory to second 1d array

        var integers = numbers[0][1];
       
        integers[0] = 5;
        integers[1] = 56;
        
        var second1D  = numbers[0][0];
        second1D[0] = 99;
        second1D[1] = 21;
        second1D[2] = 34;

        print3DArray(numbers);
        //numbers[1][0] = new int[2];

    }

    public static void print3DArray(int[][][] numbers){
        for(int i = 0; i < numbers.length;i++){
            for(int j = 0; j < numbers.length;j++){
                for(int k = 0; k < numbers[i][j].length;k++){
                    System.out.print(numbers[i][j][k] + " ");
                }
            System.out.println();
            }
            System.out.println();
        }
    }
}
