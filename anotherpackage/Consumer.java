package anotherpackage;

public class Consumer implements Runnable{
    Q q;
    Thread t;

    Consumer(Q q){
        this.q = q;
        t = new Thread(this, "Consumer");
    }

    public void run(){
        int j = 0;
        while(j <= 10){
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            q.get();
            j++;
        }
    }
}
