package mypackage;

public class Test {

    public static void main(String[] args){
        var number = 2;
        var number2 = 5;
        var name = "James Jimmy";

        System.out.println(number);
        System.out.println(number2);
        System.out.println(name);

        GeoObject rect = new Rectangle();
        System.out.println(rect.getColor());
        System.out.println(((Rectangle)rect).getArea());

        Callback c = new Client();

        ((Client)c).nonInterfaceMethod();
    }
    
}
