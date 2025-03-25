package mypackage;

public class JavaIf {
    public static void main(String[] args) {
        int done = 0;
        if(done == 0){

        }
        if(done != 0){

        }

        int ratio, denom,num;
        ratio = denom = num = 0;

        //System.out.println(ratio);
        //ratio = denom == 0 ? "Division by zero": num/denom;

        System.out.println(denom == 0 ? "Division by zero": num/denom);

        num = 28;
        ratio = 8;

        if(ratio == 1)
        denom = 12;
        else
            if(ratio == 2)
            denom = 56;
        else
        denom = 8;
        if(ratio == 8){//another if
                System.out.println("denom" + denom);
                denom = 18;
            }
        else//this else is part of the above if(labeled "another if")
            denom = 11;
        
        System.out.println(denom);
    }
}
