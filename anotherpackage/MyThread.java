package anotherpackage;

public class MyThread  implements Runnable{
    private static final Object lock = new Object();
    @Override
    public void run() {
        synchronized(lock){

            for(int i = 5; i >= 1; i--){
                System.out.println(Thread.currentThread().getName() + " " + i);
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){
                    System.out.println(Thread.currentThread().getName() + " Interrupted!");
                }
            }
        }
    }
}
