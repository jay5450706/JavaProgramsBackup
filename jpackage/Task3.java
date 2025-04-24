package jpackage;

public class Task3 extends Thread{
    @Override
    public void run() {
        for(int i = 1; i <= 3; i++){
            System.out.println("Task3 running: " + i);
        }
    }
}
