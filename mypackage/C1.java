package mypackage;
/*
 * this class is mutable because there is a getter getC2
 * that returns a mutable object - and the object is
 * mutable because it has the setter setX
 */
public class C1 {
    private int y;
    private C2 c2;

    public C1(int y, C2 c2){
        this.y = y;
        this.c2 = c2;
    }

    public int getY(){
        return this.y;
    }

    public C2 getC2(){
        return this.c2;
    }
}
