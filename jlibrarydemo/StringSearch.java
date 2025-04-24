package jlibrarydemo;

public class StringSearch {
    public static void main(String[] args) {
        String sentence = "Say Hello to your friend";

        int hIndex = sentence.indexOf('h');
        int HIndex = sentence.indexOf('H');

        System.out.println("hIndex: " + hIndex + " HIndex: " + HIndex);
        System.out.println(sentence.charAt(HIndex));

        System.out.println("index of 'o': " + sentence.indexOf('o') + 
        " Last index of 'o': " + sentence.lastIndexOf('o') );

        System.out.println("Character after 'o': " + sentence.charAt(sentence.indexOf('o') + 1) + 
        " Character after last 'o': " + sentence.charAt(sentence.lastIndexOf('o') + 1));

        sentence = "I love Apples. Apples are sweet";

        int applesIndex = sentence.indexOf("Apples");
        String searchTerm = "Applesabc";

        char[] chars = new char[6];
        searchTerm.getChars(0, 6, chars, 0);

        int lastApplesIndex = sentence.lastIndexOf(new String(chars));
        System.out.println("Apples index: " + applesIndex + " Last Apples index: " + lastApplesIndex);

        sentence.indexOf(97);
        sentence.indexOf('a');

    }
}
