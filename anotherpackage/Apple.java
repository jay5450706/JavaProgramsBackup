package anotherpackage;

public enum Apple {

    Jonathan(35), RedDel, GoldenDel(9), Winesap(15), Cortland(8);

    private int price;
    
    Apple(){
        price = -1;
    }

    Apple(int price){
        this.price = price;
    }

    int getPrice(){
        return this.price;
    }
}
