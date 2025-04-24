package anotherpackage;

public class GenericClass<T> {

    T ob;

    GenericClass(T o){
        ob = o;
    }

    T getOb(){
        return ob;
    }

    void showType(){
        System.out.println(ob.getClass().getName());
    }
    
}
