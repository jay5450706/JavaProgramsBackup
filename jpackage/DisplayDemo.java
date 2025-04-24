/*
 * Display.java into action
 */
package jpackage;

public class DisplayDemo {
    public static void main(String[] args) {
    
        Display obj = new Display();

        DisplayCode code = new DisplayCode(obj);
        DisplayLetter letter = new DisplayLetter(obj);
        
        Thread displayCode = new Thread(code, "DisplayCode");
        Thread displayLetter = new Thread(letter, "DisplayLetter");

        displayCode.start();
        displayLetter.start();

        try {
            displayCode.join();
            displayLetter.join();
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " Interrupted");
        }
    }
}
