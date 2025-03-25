package mypackage;

public class StringBasics {
    public static void main(String[] args) {
        String name = "John";
        String studentName = "Mark Owen";

        char secondChar = "Samson".charAt(1);
        String lastName = "john";
        String surName = "Mark Owen";

        int len1 = "James  ".length();
        int len2 = "James and John".length();
        int len3 = lastName.length();

        String greeting = "Good Morning Everyone";

        System.out.println("Pointing to Same Memory Location: " + (studentName == surName));//without brackets, 
        //string+studentName address compared with surName hence false is printed.

        System.out.println("John equals john: " + name.equals(lastName));
        System.out.println("studentName= " + studentName + " equals " + surName + ": " + studentName.equals(surName));
        System.out.println("greeting equals \"Good Morning Everyone\": " + greeting.equals("Good Morning Everyone"));
        System.out.println("Second character in Samson is: " + secondChar);
        System.out.println(len1 + " " + len2 + " " + len3);
    }
}
