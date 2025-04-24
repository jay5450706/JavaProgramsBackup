package jlibrarydemo;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        
        System.out.println("Buffer= " + sb);
        System.out.println("Length= " + sb.length());
        System.out.println("Capacity= " + sb.capacity());
    }
}
