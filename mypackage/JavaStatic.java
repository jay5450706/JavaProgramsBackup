package mypackage;

public class JavaStatic {
    public static void main(String[] args) {
       new JavaStatic().sayHi();
    }

    public void sayHi(){
        System.out.println(new StaticDemo().instanceVar);
        sayHello();
        System.out.println("Hi");
    }

    public static void sayHello(){
        System.out.println("Hello");
    }
}
