package mypackage;

public class VarArgs {
    public static void main(String[] args) {
        concat(new String[]{"My","name","is","John"});
    }

    public static void concat(String...text){
        String joined = null;
        for(int i = 0; i < text.length; i++){
            joined += (text[i] + " ");
        }

        System.out.println(joined);
        System.out.println('a' + " " +  'b');
    }
}
