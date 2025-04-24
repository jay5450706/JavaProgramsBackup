package anotherpackage;

public class SuspendResume {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");

        ob1.t.start();
        ob2.t.start();

        try {
            Thread.sleep(2000);
            ob1.mySuspend();
            System.out.println("Suspending thread one");
            Thread.sleep(2000);
            ob1.myResume();
            System.out.println("Resuming thread one");

            ob2.mySuspend();
            System.out.println("Suspending thread two");
            Thread.sleep(2000);
            ob2.myResume();
            System.out.println("Resuming thread two");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        try {
            System.out.println("Waiting for thread to finish");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread exiting");
    }
}
