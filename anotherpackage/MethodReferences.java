package anotherpackage;

public class MethodReferences {
    public static void main(String[] args) {
       stringOp(StringOperations::strReverse, "Static Methods References");

       StringOperations strOps = new StringOperations("John", "#");

       stringOp(strOps::join, "Anderson");

       Method<String> name = (str)-> {
            String surname = "John";
            return str + " " + surname;
       };

       System.out.println(concatenate(name, "James"));

    }

    static void stringOp(StringMethod m, String s){
        System.out.println(m.stringFunc(s));
    }

    public static String concatenate(Method<String> name,String surname){
        return name.function(surname);
    }
}
