package mypackage;

public class Rectangle extends GeoObject {
    private double height;
    private double width;
    
    public Rectangle(){
        //super("Green");
        this(1,1);
    }
    
    public Rectangle(double height, double width){
        //super("Yellow");
        this.height = height;
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getWidth(){
        return this.width;
    }

    // @Override
    // double getArea(){
    //     return this.width * this.height;
    // }

    public String toString(){
        return "Height= " + this.height + " Width= " + this.width + " Color= " + super.toString();
    }

    @Override
    double getArea() {
        return 0;
    }
    
}
