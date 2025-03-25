/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realworldbox;

/**
 *
 * @author user
 */
public class Producer implements Runnable {
    Q q;
    
    Producer(Q q){
        this.q = q;
        new Thread(this, "Producer").start();
    }
    
    public void run(){
        int i = 0;
        while(i < 10){
            q.put(i++);
        }
    }
    
}
