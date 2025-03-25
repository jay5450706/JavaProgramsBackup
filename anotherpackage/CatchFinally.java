/*
 * which is executed first, catch or finally block? It depends
 * 
 */

package anotherpackage;

public class CatchFinally {
    public static void main(String[] args) {
        try{
            methodA();
        }catch(RuntimeException e){
            System.out.println("Trapping exception of method A...");
            System.out.println(e);
        }

        methodB();
    }

    public static void methodA(){
        try{
            System.out.println("Inside method A");
            throw new RuntimeException("From method A");
            //System.out.println("After Method A Exception"); Unreachable code
        }finally{
            System.out.println("Inside method A finally block");
        }

        //System.out.println("last statement of method A"); Unreachable code
    }

    public static void methodB(){
        try{
            System.out.println("Inside method B");
            throw new RuntimeException("From method B");
            //System.out.println("After Method A Exception"); Unreachable code
        }catch(RuntimeException e){
            System.out.println("Method B processing exception...");
            System.out.println(e);

        }
        finally{
            System.out.println("Inside method B finally block");
        }
        System.out.println("last statement of method B");
    }
    
}
