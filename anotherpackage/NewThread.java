package anotherpackage;

class NewThread implements Runnable{
    String name;
    Thread t;

    boolean suspendFlag;

    NewThread(String threadName){
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New Thread: "  + t);
        suspendFlag = false;
    }

    public void run(){
        try {

            for(int i = 15; i > 0; i--){
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
                synchronized(this){
                    while (suspendFlag) {
                        wait();
                    }
                }
            }

        } catch (InterruptedException e) {
            System.out.println(name + " interrupted.");
        }

        System.out.println(name + " exiting.");
    }

    synchronized void mySuspend(){
        suspendFlag = true;
    }
    
    synchronized void myResume(){
        suspendFlag = false;
        notify();
    }
}