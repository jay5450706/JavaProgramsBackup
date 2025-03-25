package mypackage;

public class Client implements Callback {

    public void callback(int p){
        System.out.println("Callback called with " + p);
    }

    void nonInterfaceMethod(){
        System.out.println("Classes that implement interfaces\n" +
        "may also define other members too");
    }

    public int favoriteNumber(int favoNum){
        return favoNum;
    }
    
}
