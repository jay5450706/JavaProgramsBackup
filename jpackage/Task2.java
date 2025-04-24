package jpackage;

public class Task2 extends Thread{
    @Override
    public void run() {
        for(int i = 1; i <= 3; i++){
            System.out.println("Task2 running: " + i);
        }
    }
}
