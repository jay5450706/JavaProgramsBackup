package mypackage;

public class MainClass {
    public static void main(String[] args) {
        // Anonymous inner class that extends the Animal class
        Animal dog = new Animal() {
            @Override
            public void sound() {
                System.out.println("Dog barks");
            }
        };

        // Calling the method
        dog.sound();


        // Passing an anonymous class as an argument
        performOperation(5, 3, new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        });

    }


    public static void performOperation(int a, int b, MathOperation operation) {
        int result = operation.operate(a, b);
        System.out.println("Result: " + result);
    }
}
