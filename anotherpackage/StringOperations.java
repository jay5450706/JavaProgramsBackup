package anotherpackage;

public class StringOperations {
    String lString = "";
    String delimiter;

    StringOperations(String lString, String delimiter){
        this.lString = lString;
        this.delimiter = delimiter;
    }

    StringOperations(){
        this("", " ");
    }

    StringOperations(String lString){
        this(lString, " ");
    }

    //methods compatible with stringFunc of StringMethod Interface

    static String strReverse(String str){
        String result = "";
        int i;

        for(i = str.length() - 1; i >= 0; i--){
            result += str.charAt(i);
        }

        return result;
    }

    String join(String str){
        //join 2 strings
        return lString + delimiter + str;
    }
}
