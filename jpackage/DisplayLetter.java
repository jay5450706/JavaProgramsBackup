package jpackage;

public class DisplayLetter implements Runnable{
    Display ref;

    DisplayLetter(Display ref){
        this.ref = ref;
    }

    @Override
    public void run() {
        //ref.printCode(); //to demonstrate that truly that ref.printCode() is locked
       ref.printLetter();
    }
}
