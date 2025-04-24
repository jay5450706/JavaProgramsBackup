package anotherpackage;

public class Producer implements Runnable{
    Q q;
    Thread t;

    Producer(Q q){
        this.q = q;
        t = new Thread(this, "Producer");
    }

    public void run(){
        int i = 0;

        int j = 0;
        while(j <= 10){

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            q.put(i++);
            j++;
        }
    }
    
}
