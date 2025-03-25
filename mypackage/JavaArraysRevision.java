package mypackage;

public class JavaArraysRevision {
    public static void main(String[] args) {
        int twoD[][] = new int[4][];

        twoD[0] = new int[5];
        twoD[1] = new int[2];

        int threeD[][][] = new int[2][][];

        //first 2D array
        threeD[0] = new int[3][]; //has three rows

        threeD[0][0] = new int[5];
        threeD[0][1] = new int[3];
        threeD[0][2] = new int[2];

        threeD[0][2][0] = 10;
        threeD[0][2][1] = 20;
        //threeD[0][2][2] = 40;

        System.out.println(threeD[0][2][0]);
        System.out.println(threeD[0][2][1]);
        //System.out.println(threeD[0][2][2]);

        //second 2D array
        int a = 4;
        threeD[1] = new int[a][];
        threeD[1][3] = new int[a];

       // int len = threeD[1][3].length;

        threeD[1][3][3] = 50;
        //threeD[1][3][4] = 50;
        System.out.println(threeD[1][3][3]);

        int[][][] array2 = {

            {
                {10, 11, 12, 13, 14}, //row 1
                {22, 23, 24, 25, 26}, //row 2
                {30, 31, 32, 33, 35}, //row 3
                {40, 41, 42, 43, 44} //row 4
                
            }, //1st 2d
            
            {
                
                {10, 11, 12, 13, 14}, //row 1
                {22, 23, 24, 25, 26}, //row 2
                //{30, 31, 32}, //row 3
                {40, 41, 42, 43, 44} //row 4

            }, //2nd 2d
            
            {
                {10, 11, 12, 13, 14}, //row 1
                {22, 23, 24, 25, 26}, //row 2
                //{30, 31, 32, 33, 35}, //row 3
                //{40, 41, 42, 43, 44} //row 4

            } //3rd
        };

        System.out.println("Printing 3D array row by row");
        for(int i = 0; i < array2.length; i++){
            for(int j = 0; j < array2[i].length;j++){
                for(int k = 0; k < array2[i][j].length;k++){
                    System.out.print(array2[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println("................");
        }

        System.out.println("using for each loop");

        for(int[][] x:array2){
            for(int[] y:x){
                for(int z:y){
                    System.out.print(z + " ");
                }
                System.out.println();
            }
        }

        // System.out.println("Printing 3D array column by column");

        // //for(int k = 0; k < length of 2D){

        // //}

        // for(int i = 0; i < 5;i++){
        //     for(int j = 0; j < array2[j].length;j++){
        //         for(int k = 0; k < array2.length;k++)
        //         System.out.println(array2[i][j][j]);
        //         //print column of 1st 2d
        //     }
        // }
        
    }
}
