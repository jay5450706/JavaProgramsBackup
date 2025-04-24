package jpackage;

public class Multithreading {

    public static void main(String[] args) {
        
        Task1 one = new Task1();
        Task2 two = new Task2();
        Task3 three = new Task3();

        one.start();
        two.start();
        three.start();

        for(int i = 5; i >= 1; i--){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

        try {
            one.join();
            two.join();
            three.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception Caught");
        }
        
    }

}
