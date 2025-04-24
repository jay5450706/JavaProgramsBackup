package anotherpackage;

public class Caller implements Runnable{
    private static final Object lock = new Object();
    
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
    }

    public void run(){

        synchronized(lock){

            target.call(msg);
        }
    }
}
