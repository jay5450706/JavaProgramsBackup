package mypackage;

public class OuterClass {
    
    public void display() {
        // Local inner class inside a method
        class LocalInnerClass {
            public void printMessage() {
                System.out.println("This is a local inner class.");
            }
        }

        // Creating an object of the local inner class
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.printMessage();  // Calling the method of the local inner class
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.display();  // Invoke the method that contains the local inner class
    }
}