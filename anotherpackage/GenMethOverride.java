package anotherpackage;

import mypackage.GeoObject;
import mypackage.Rectangle;


public class GenMethOverride {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen2<>(28);

        //Gen<Double> iOb = new Gen2<>(28.0);error when you pass 28 

        int value = iOb.getOb();

        System.out.println("Value is: " + value);

        passString("James" + " and" + " John");

        //Demonstrating casting
        GeoObject geo = new Rectangle();//Implicit casting
        Rectangle rect;

        //rect = geo;//Implicit casting cannot happen - error type mismatch 
        rect = (Rectangle)geo; //Explicit casting

        System.out.println(rect);//toString of rect

        Gen<Rectangle> rectObj = new Gen2<>(new Rectangle());//Implicit casting from Gen2<Rectangle> to Gen<Rectangle>
        System.out.println(rectObj.getOb());
        
        System.out.println(rectObj);//calls toString of Gen2 which is inherited from Object

        Gen<GeoObject> geoObj = new Gen2<GeoObject>(new Rectangle());//Implicit casting from Rectangle to GeoObject
        Gen2<GeoObject> r = (Gen2<GeoObject>)geoObj;
        System.out.println(r.getOb());

        var myObj = new Gen<>("James");
        System.out.println(myObj.getOb());
    }

    public static void passString(String str){
        System.out.println(str);
    }

    public <T> void test(Gen<T> a){//T is unrelated with Gen's T

    }

    public void test(Gen2<Integer> a){

    }
}
