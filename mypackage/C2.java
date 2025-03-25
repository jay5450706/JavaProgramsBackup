package mypackage;

public class C2 {
    private int x;

    public C2(){
        this(1);
    }

    public C2(int x){
        setX(x);
        //this.setX(x);
        //this.x = x;
    }

    public void setX(int x){
        System.out.println("In");
        this.x = x;
        System.out.println("Out");
    }

    public int getX(){
        return x;
    }
}
