/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarevisionproject;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Revision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names;
        names = new String[5];
        
        String[] fruits = new String[5];
        Scanner input = new Scanner(System.in);
        int choice;
        
        do{
            System.out.println("MENU");
            System.out.println("1. Input names");
            System.out.println("2. Display names");
            System.out.println("3. Input fruits");
            System.out.println("4. Display fruits");
            System.out.println("5. Exit");
            System.out.println();
            
           choice = input.nextInt();
            
            switch(choice){
            
                case 1: 
                    System.out.println("Press '6' to exit input");
                    names = fillArray(names);
                   break;
                case 2:
                    printArray(names);
                    break;
                case 3:
                    System.out.println("Press '6' to exit input");
                    fruits = fillArray(fruits);
                    break;
                case 4:
                    printArray(fruits);
                    break;
                    
            
            }
            
        }while(choice != 5);
        
       
       
        
       
        // TODO code application logic here
    }
     public static String[] fillArray(String[] text){
         
         Scanner input = new Scanner(System.in);
         
         for(int i = 0; i < text.length;i++){
             text[i] = input.nextLine();
//             char store6 = text[i].charAt(text[i].length());
//             
//             if(store6 == '6')
//                 break;
             
         }
            
            return text;
        }
     
      public static void printArray(String[] text){
       
           for(int i = 0;i < text.length;i++){
           if(text[i] == null)
                continue;
            System.out.println(text[i] + " ");
           } 
       
  
        }
        
}
