package anotherpackage;

public class Synchronize {
    public static void main(String[] args) {
        Callme target = new Callme();
        Callme target2 = new Callme();
        
        Caller ob1 = new Caller(target,"Hello");
        Caller ob2 = new Caller(target2, "Synchronized");
        Caller ob3 = new Caller(target, "World");

        ob1.t.start();
        ob2.t.start();
        ob3.t.start();

        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}
