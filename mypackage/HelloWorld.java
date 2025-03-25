package mypackage;

class HelloWorld{

    public static void main(String[] args) {

        Drawable figure = new Rectangle(); //we can access only the methods of Drawable without type casting.

        Drawable figure2 = new GeoObject();

        ((GeoObject)figure).getColor(); //only methods of GeoObject without casting

        ((Rectangle)figure2).getWidth();

        //Drawable figure4 = new HelloWorld();//type mismatch

        //Imagine: an unnamed class that implements Drawable
        Drawable figure3 = new Drawable() {
            @Override
            public void draw() {
                System.out.println("figure3 is drawable");
            }
        };
    
        figure3.draw();

        ((Rectangle)figure3).getHeight();

       Rectangle rect = new Rectangle(){
            @Override
            public void draw() {
                System.out.println("Drawing Rectangle");
            }
        };
        

        rect.draw();//Drawing Rectangle printed

        Rectangle rect2 = new Rectangle();
        rect2.draw();//super class draw method called

        //System.out.println((1_523_554_304 == 1523554304)); //comparing identical expressions
        // var name = "James";
        // var number = 2;
        // System.out.println("Hello World of java programmers!!");
        // System.out.println(name);
        // System.out.println(number);
    }

}  