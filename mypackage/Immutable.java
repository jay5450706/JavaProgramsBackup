package mypackage;

public class Immutable {
    public static void main(String[] args) {

        C2 obj = new C2(21);
        System.out.println(obj.getX());

        // C1 c1 = new C1(12, new C2(10));
        // C2 obj = c1.getC2();

        // obj.setX(50); 

        
    }
}
