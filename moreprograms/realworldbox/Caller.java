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
public class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;
    String name;
    
    public Caller(Callme targ, String s, String name){
        target = targ;
        msg = s;
        this.name = name;
        t = new Thread(this,name);
        t.start();
        
    }
    
    public void run(){
        target.call(msg);
    }
    
}
