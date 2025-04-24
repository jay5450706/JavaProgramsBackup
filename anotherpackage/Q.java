package anotherpackage;

//Queue
public class Q {
    int n;
    boolean valueSet = false;

    synchronized int get(){
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException Caught");
            }
        }

        // try {
        //     Thread.sleep(2000);
        // } catch (InterruptedException e) {
        //     System.out.println("Interrupted while sleeping");
        // }
        
        System.out.println("Got: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n){
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }

        // try {
        //     Thread.sleep(2000);
        // } catch (InterruptedException e) {
        //     System.out.println("In put(): Interrupted while sleeping");
        // }

        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }
}
