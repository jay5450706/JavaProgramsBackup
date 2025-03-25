package mypackage;

public class MethodOverloading {
    
    public static void main(String[] args) {
        final String name;
        name = "John";
        
        System.out.println(name);
    }

    public String test(String a){
        return a + "Hello";
    }

    public int test(int b){
        return b;
    }
}
