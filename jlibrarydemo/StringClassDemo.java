package jlibrarydemo;

public class StringClassDemo {
    public static void main(String[] args) {
        char[] characters = {'a', 'b', 'c', 'd', 'e', 'f'};

        String sFromChar = new String(characters);

        System.out.println("String From Char Array: " + sFromChar);

        String subRange = new String(characters, 2, 3);

        System.out.println("SubRange: " + subRange);

        String fromStrObj = new String(sFromChar);

        System.out.println("String From String Object: " + fromStrObj);

        int stringLength = fromStrObj.length();
        System.out.println("The length of 'fromStrObj' is: " + stringLength);

        //String comparison
        char[] chars = {'a', 'b', 'c'};
        String s1 = new String(chars);
        String s2 = "abc";

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1: " + System.identityHashCode(s1) + " s2: " + System.identityHashCode(s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));

        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = "Hello";
        String str4 = "Hello";

        System.out.println("String Comparison");
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str3 == str4: " + (str3 == str4));
        System.out.println("str3.equals(str4): " + str3.equals(str4));

        System.out.println();

        char[] fromString = subRange.toCharArray();
        System.out.println(fromString);
        
        str1 = "HelloWorld";
        str2 = "helloworld";

        boolean b = str1.regionMatches(true, 0, str2, 0, 6);
        System.out.println(b);

    }
}
