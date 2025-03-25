package mypackage;

public class GeoObject implements Drawable{
    private String color;
    
    public GeoObject(){
        this("White"); //we want the object to be complete, to have a color
    }

    public GeoObject(String color){
        this.color = color;
    }

    public void setFilled(String color){
        this.color = color;
    }

    public boolean isFilled(){
        if(this.color != null){
            return true;
        }
        return false;
    }

    public String getColor(){
        return this.color;
    }

    double getArea(){
        return 0;
     }

     @Override
     public void draw() {
         System.out.println("drawing");
     }

    public String toString(){
        return this.color;
    }
    
}
