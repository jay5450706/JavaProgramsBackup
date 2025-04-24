package jlibrarydemo;

public class IntegralObjectTypes {
    public static void main(String[] args) {
        String s = "10111";

        int fromString = 0;

        fromString = Integer.parseInt(s, 2);// 23

        System.out.println(fromString);

        fromString = Integer.parseInt("116", 8);// 78

        System.out.println(fromString);

        String numberString = "456";
        int number =  Integer.parseInt(numberString);

        String binaryString = Integer.toBinaryString(number);
        String octalString = Integer.toOctalString(number);
        String hexString = Integer.toHexString(Integer.parseInt("456"));

        System.out.println("456 in Binary: " + binaryString + "\n" +
        "456 in octal: " + octalString + "\n" + 
        "456 in hexadecimal: " + hexString);

    }
}
