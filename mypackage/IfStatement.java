package mypackage;

public class IfStatement {
    public static void main(String[] args) {
        boolean b = false;
        if(!b) System.out.println("Expression is true");

        if(5 < 7)
        System.out.println("5 is less than 7");

        if(b)
        System.out.println("Expression is false");
        System.out.println("Doesn't belong to if");

        int a = 10, c = 11;
        if(a == c)
        System.out.println("10 is equal to 10");
        //System.out.println("Another statement"); //This line of code results to a syntax error, else without if
        else
        System.out.println("Not equal");
        System.out.println("After if else");


        char ch = 'a';
        if(ch == 'a')
            if(c > a)
                System.out.println("Character is not b");
            else if(a < c){
               // System.out.println("statement"); //remove brackets and uncomment, an error results.
            }
        else
        System.out.println();


    }
}
