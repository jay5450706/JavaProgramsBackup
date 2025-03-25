/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realworldbox;

/**
 *
 * @author user
 */
public class Stats<T extends Number> {
    
    T[] nums;//Integer[] nums;
    
    Stats(T[] o){//inums ---Integer[] o---o and inums refer to the same object nums and inums refer to the same object
        nums = o;
    }
    
    void printArray(){
        System.out.println("Printing Array Elements");
        for(int i = 0; i < nums.length; i++){
                System.out.println(nums[i]);
        }
        
        System.out.println("Printing using a for each loop");
        for(T numbers:nums)
            System.out.println(numbers);
    }
    
    double average(){
        double sum = 0.0;
        
        for(int i = 0; i < nums.length; i++){
            sum += nums[i].doubleValue();
        }
        return sum/nums.length;
    }
    
    boolean sameAvg(Stats<?> ob){/*if T instead of ? then when creating an object of this class and calling
        this method using that object remember iob.average() - you are calling the average method of iob object
        and this object has already defined T as an Integer*/
            if(average() == ob.average())
                return true;
            
            return false;
    }
    
}
