package anotherpackage;

public class Gen<T> {
    T ob;

    Gen(T ob){
        this.ob = ob;
    }

    T getOb(){
        System.out.print("Gen's getOb(): ");
        return ob;
    }

    public <V extends Number> void test(Gen<T> a, V b){

    }

    // @Override
    // public String toString(){
    //     return super.toString();
    // }
}
