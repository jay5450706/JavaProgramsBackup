package anotherpackage;

public class ThreadsDemo {
    public static void main(String[] args) {
        
        MyThread thread = new MyThread();
        MyThread thread4 = new MyThread();
        // MyThread thread3 = new MyThread();

        Thread four = new Thread(thread4, "FOUR");
        Thread one = new Thread(thread, "one");
        Thread two = new Thread(thread, "two");

        // Thread three = new Thread(thread, "three");

        one.start();
        four.start();
        two.start();
        // three.start();

        try{
            System.out.println("Waiting threads to finish");
            one.join();//pause main thread until one finishes
            two.join();
            // three.join();
            four.join();

        }catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
    }
}
