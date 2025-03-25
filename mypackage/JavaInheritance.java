package mypackage;

public class JavaInheritance {
    
    static Rectangle rectangle = new Rectangle(){
       
        @Override
        public void draw() {
            System.out.println("drawing rectangle ...");
        }
    };

    
    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle();
        GeoObject geo = (GeoObject)rect;
        GeoObject geoObj = rect;

        ((Rectangle)geo).getHeight();
        System.out.println(geo);
        System.out.println(geoObj);

        GeoObject figure = new Square();
        System.out.println(figure);

        Object arr = new int[2];
        int[] array = (int[])arr;
        
        array[0] = 20;
        array[1] = 50;


        rectangle.draw();
    }
    
}
