package anotherpackage;

public class Gen2<T> extends Gen<T>{
    Gen2(T o){
        super(o);
    }

    @Override
    T getOb(){
        System.out.print("Gen2's getOb(): ");
        return ob;
    }

}