/*
 * Demonstrates that non-synchronized methods are callable
 */

package jpackage;

public class Display {

    synchronized void printCode(){
        char letter = 'a';
        for(;letter <= 'f';letter++){

            try {  
                Thread.sleep(1000);//simulate some processsing then print
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " Interrupted");
            }

            System.out.println(Thread.currentThread().getName() + " " + (int)letter);
        }
    }

    //void printLetter(){//uncomment this, comment the following immediate statement,
    //to demonstrate that this method is callable when printCode is synchronized
    synchronized void printLetter(){
        char letter = 'a';
        for(;letter <= 'f';letter++){

            try {  
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " Interrupted");
            }

            System.out.println(Thread.currentThread().getName() + " " + letter);
        }
    }
    
}
