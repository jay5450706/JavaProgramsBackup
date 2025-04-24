package anotherpackage;

interface MyPrinter {
	void print();
}

public class EffectivelyFinalDemo {
    String name = "EffectivelyFinalDemo";

    public void show() {
    String localVar = "Hello"; // effectively final
    
    MyPrinter printer = () -> { // localVar is accessed — allowed because it's effectively final
        System.out.println(localVar); // this refers to EffectivelyFinalDemo instance
        System.out.println("this.name = " + this.name);
        this.name = "James";
        System.out.println("this.name = " + this.name);
        name = "Peter";
        System.out.println("this.name = " + this.name);
        //localVar = "Bye";
    };
    printer.print(); 
    // Uncommenting this line will cause a compile error
     // localVar = "New Value"; // makes it not effectively final 
     this.name = "Samson";
    }
    
    public static void main(String[] args) { 
    EffectivelyFinalDemo obj = new EffectivelyFinalDemo();
    obj.show();
    }
}
    