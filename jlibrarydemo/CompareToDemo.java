package jlibrarydemo;

public class CompareToDemo {
    public static void main(String[] args) {
        String str1 = "Beyond", str2 = "Behold";

        compare(str1, str2);
        System.out.println("Comparison Ignoring Case");
        compareIgnoreCase(str1, str2);
        
        str1 = "beyond"; 
        System.out.println();

        compare(str1, str2); //letter b is greater than letter B
        System.out.println("Comparison Ignoring Case");
        compareIgnoreCase(str1, str2);
        
        str1 = "HELLO"; str2 = "hello";
        System.out.println();

        compare(str1, str2);
        System.out.println("Comparison Ignoring Case");
        compareIgnoreCase(str1, str2);

        str1 = "Hello";
        System.out.println();

        compare(str1, str2);
        System.out.println("Comparison Ignoring Case");
        compareIgnoreCase(str1, str2);
        
        System.out.println();

        compare("H", "h");
        System.out.println("Comparison Ignoring Case");
        compareIgnoreCase("H", "h");
        
    }

    public static void compareIgnoreCase(String str1, String str2) {

        if(str1.compareToIgnoreCase(str2) < 0){
            System.out.println(str1 + " appears before(is less than) " + str2);
        }

        if(str1.compareToIgnoreCase(str2) > 0){
            System.out.println(str1 + " comes after(is greater than) " + str2);
        }

        if(str1.compareToIgnoreCase(str2) == 0){
            System.out.println(str1 + " is equal to " + str2);
        }
    }

    public static void compare(String str1, String str2){

        if(str1.compareTo(str2) < 0){
            System.out.println(str1 + " appears before(is less than) " + str2);
        }

        if(str1.compareTo(str2) > 0){
            System.out.println(str1 + " comes after(is greater than) " + str2);
        }

        if(str1.compareTo(str2) == 0){
            System.out.println(str1 + " is equal to " + str2);
        }

    }
}
