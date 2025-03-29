package anotherpackage;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.Jonathan;
        System.out.println(ap + " goes at " + ap.getPrice());

        System.out.println("Winesap costs " + Apple.Winesap.getPrice() + " cents. \n");

        System.out.println("All apples and their prices:");

        Apple apples[] = Apple.values();

        for(int i = 0; i < apples.length; i++){
            System.out.println(apples[i] + " costs " + apples[i].getPrice() + " cents.");
        }

        System.out.println(ap.equals(Apple.Jonathan));

        // boolean bool = ap == "Winesap";
        // System.out.println(bool);
    }
}
