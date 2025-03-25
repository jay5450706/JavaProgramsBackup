package anotherpackage;
/*
 * if an exception occurs the rest of the statements are skipped,
 * therefore, the ArithmeticException won't be generated
 */
public class MultiCatch {
    public static void main(String[] args) {
        
        int a = 10, b = 0;
        int values[] = {1, 2, 3};
    
        try{

            values[10] = 10;//generate an ArrayIndexOutOfBoundsException
            int result = a/b; //generate an ArithmeticException
    
            System.out.println(result);
    
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught: " + e);
        }

        System.out.println("After multi-catch");
    }
}
