package anotherpackage;

public class LambdaAsArgument {
    
    public static void main(String[] args) {

        String outStr = stringOp((str) -> str.toUpperCase(), "your name is james");
        System.out.println(outStr);

        outStr = stringOp(
            (str) -> {
                String result = str.charAt(0) + " " + str.charAt((str.length() - 1));
                return "1st & Last Characters: " + result;
            }, "Hello World"
        );

        System.out.println(outStr);

        StringMethod trim = str -> {
            return str.trim();
        };

        System.out.println(stringOp(trim, "      String Trimmed    "));

        printCode(str -> {
            String whiteSpaceRemoved = "";

            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) != ' '){
                    whiteSpaceRemoved += str.charAt(i);
                }
            }

            return whiteSpaceRemoved;
        } );
    }

    static String stringOp(StringMethod sf, String s){
        return sf.stringFunc(s);
    }

    static void printCode(StringMethod method){
        String input = method.stringFunc("Hello World Of Java Programming!");

        System.out.println(input);

        for(int i= 0; i < input.length(); i++){
            System.out.print(input.charAt(i) + "=" + (int)(input.charAt(i)) + " " );
        }
    }
}

