package mypackage;
import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {

        System.out.print("Input your name: ");
        Scanner input = null;
        
        input = new Scanner(System.in);
        String name = input.nextLine(); // = new Scanner(System.in).nextLine();

        System.out.println(name.isEmpty() || name.isBlank() ? "Invalid name" : "I got your name: " + name);

        input.close();
    }
}
