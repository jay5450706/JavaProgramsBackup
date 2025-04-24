package anotherpackage;

import mypackage.Rectangle;

public class GenExample {
    public static void main(String[] args) {
        GenericClass<Integer> iob = new GenericClass<Integer>(88);

        //no casting required
        int intValue = iob.getOb();
        System.out.println(intValue);

        //showing the type of ob not iob
        iob.showType();

        GenericClass<String> strOb = new GenericClass<>("Java Generics");
        String strLiteral = strOb.getOb();
        System.out.println(strLiteral);

        strOb.showType();

        GenericClass<Rectangle> rectOb = new GenericClass<>(new Rectangle(4,5));
        
        System.out.println(rectOb.getOb().toString());
        
        Rectangle anotherRectRef = rectOb.getOb();
        anotherRectRef.setHeight(20);
        anotherRectRef.setWidth(10);

        System.out.println(rectOb.getOb().toString());

        System.out.print("The type of ob of rectOb: ");
        rectOb.showType();

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Statistics<Double> dob = new Statistics<>(dnums);

        GenericClass<Statistics<Double>> statsDoubleObj = new GenericClass<>(dob);

        //printing the array
        for (double doubleValue : statsDoubleObj.getOb().nums) {
            System.out.print(doubleValue + " ");
        }
        System.out.println();

        double average = statsDoubleObj.getOb().average();
        System.out.println("The average is: " + average);

        System.out.println("Type of statsDoubleObj " + statsDoubleObj.getClass().getName());
        System.out.println("Type of rectOb " + rectOb.getClass().getName());

        System.out.println("The type of ob of statsDoubleObj");
        statsDoubleObj.showType();
    }
}
