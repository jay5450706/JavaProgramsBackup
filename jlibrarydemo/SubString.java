package jlibrarydemo;

public class SubString {
    public static void main(String[] args) {
        String statements = "My name is Paul. I love Java Programming.";

        int index = statements.indexOf("I love");
        System.out.println(index);

        String sentence = statements.substring(17);
        System.out.println(sentence);

        String name = statements.substring(11, 15);

        String introduction = "Hiz name is ".concat(name);

        introduction = introduction.replace('z', 's');

        System.out.println(introduction);

        int unicode = statements.codePointAt(0);
        System.out.println(unicode);

        char character = 77, anotherChar = (char)("a".codePointAt(0));
        int bCodePoint = "b".codePointAt(0);
        char charb = (char)bCodePoint;
        
        System.out.println(character);
        System.out.println(anotherChar);
        System.out.println(bCodePoint);
        System.out.println(charb);
        
    }
}
