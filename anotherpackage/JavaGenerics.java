package anotherpackage;

public class JavaGenerics {
    public static void main(String[] args) {
        
        Integer inums[] = {1, 2, 3, 4, 5};
        Statistics<Integer> iob = new Statistics<Integer>(inums);
        double v = iob.average();
        System.out.println("iob average is " + v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Statistics<Double> dob = new Statistics<>(dnums);
        double w = dob.average();
        System.out.println("dob average is " + w);

        if(iob.sameAvg(dob)){
            System.out.println("Averages are same");
        }else{
            System.out.println("Averages differ");
        }
    }
}
