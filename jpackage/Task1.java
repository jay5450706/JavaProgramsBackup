package jpackage;

public class Task1 extends Thread{
    @Override
    public void run() {
        for(int i = 1; i <= 3; i++){
            System.out.println("Task1 running: " + i);
        }
    }
}
