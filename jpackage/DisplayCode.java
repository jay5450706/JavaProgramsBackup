package jpackage;
/*
 * this thread displays code
 */
public class DisplayCode implements Runnable{
    Display ref;

    DisplayCode(Display ref){
        this.ref = ref;
    }

    @Override
    public void run() {
        ref.printCode();
    }
}
