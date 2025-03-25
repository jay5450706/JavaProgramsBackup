package mypackage;

class Hello{
    public static void main(String[] args) {
        

        short age = 25;
        int marks = age;
        
        System.out.println('b');
        System.out.println(5+6);
        
        System.out.println(marks);

        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Short.MAX_VALUE);
        // System.out.println(Byte.MAX_VALUE);
        // System.out.println(Long.MAX_VALUE);

        char c1 = 'a';
        char c2 = '\u0041';
        int code = '\u0041' ;
        int code2 = 'A';
        char c3 = 65;
        boolean b1 = 2 == 5;

        short a = 0;
        for (;a < 5;a++){
            System.out.println("I love Java: " + a);
        }
        
        System.out.print(c1 + " " + c2 + " " + c3 + "\n");
        System.out.print(code + " " + code2 + " " + b1);

        System.out.println("\nComparing characters");

        char alphabet = 'a';
        char letter = 'A';
        boolean result = letter > alphabet;
        
        
        System.out.println(letter + " > " +  result);
        System.out.println(alphabet + " > " + letter + (alphabet > letter));
        
    }
}