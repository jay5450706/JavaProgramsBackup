package anotherpackage;

public class NestedTryBlock {

    public static void main(String[] args) {
        try{
            int a = args.length;

            //Generate a divide by zero exception
            //if no command-line args

            int b = 42/a;
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            try{
                //nested try
                //generate divide-by-zero exception
                //if one command-line arg is used

                if(a==1) a = a/(a-a);

                try{
                    createException(a);
                }catch(IllegalAccessException e){
                    System.out.println(e);
                }

                //if two command-line args
                //generata an out-of-bounds exception
                if(a==2) {
                    int c[] = {1};
                    c[42] = 99;
                }

                if(a == 3)
                    throw new ArithmeticException("a is 3");


            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out-of-bounds: " + e);
            }

        }catch(ArithmeticException e){
            System.out.println("Divide by 0: " + e);
        }
    }

    public static void createException(int a) throws IllegalAccessException{
        if(a == 3)
        throw new IllegalAccessException("a is 3");
    }
}