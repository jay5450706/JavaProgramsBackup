/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronization;

/**
 *
 * @author user
 */
public class Counter {
    
    private int count = 0;
   

    public  void increment() { //synchronized
        count++;
    }

    public int getCount() { 
        
        System.out.println();
        return 5;
    }
}