/*
 * Creating different objects of a class that,
 * encapsulate a thread each object has its own version of a
 * synchronized method
 */

package jpackage;

public class SynchronizedRunDemo {
    public static void main(String[] args) {

        SynchronizedRun task1 = new SynchronizedRun();
        
        //Runnable task2 = new SynchronizedRun();

        Thread threadOne = new Thread(task1, "one");
        Thread threadTwo = new Thread(task1, "two");

        threadOne.start();
        threadTwo.start();

        // SynchronizedRun one = new SynchronizedRun();
        // SynchronizedRun two = new SynchronizedRun();

        // one.setName("one");
        // two.setName("two");

        // one.start();
        // two.start();

       try {

            threadOne.join();
            threadTwo.join();

        } catch (InterruptedException e) {
            System.out.println("IE caught");
        }
    }
}
