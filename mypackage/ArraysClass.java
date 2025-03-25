package mypackage;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        String[] names = {"James", "Mark", "Harry", "Anderson", "Esther"};
        char[] alphabets = {'b', 'd', 'a', getChar(),'e','c'};
        double[] realNumbers = {2.5, 6.3, 2.1, 2.0};
        
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        
        Arrays.sort(alphabets);
        System.out.println(Arrays.toString(alphabets));
        
        Arrays.sort(realNumbers);
        System.out.println(Arrays.toString(realNumbers));
        
        System.out.println("Comparing Arrays");
        double[] a = {2.5, 5};
        double[] b = {2.5, 5};
        double[] c = {5, 2.5};

        System.out.println(Arrays.toString(a) + " equals " + Arrays.toString(b) + ": " + Arrays.equals(a,b));
        System.out.println(Arrays.toString(b) + " equals " + Arrays.toString(c) + ": " + Arrays.equals( b,c));

        String[] animals = {"dog", "cat"};
        String[] pets = {"dog", "cat"};
        String[] favPets = {"dog", "cat", "dog"};

        System.out.println(Arrays.toString(animals) + " equals " + Arrays.toString(pets) + ": " + Arrays.equals(animals, pets));
        System.out.println(Arrays.toString(animals) + " equals " + Arrays.toString(favPets) + ": " + Arrays.equals( animals, favPets));

        boolean[] boolValues = {true, false, true};
        boolean[] values = {true, false, true};
        
        System.out.println(Arrays.toString(values) + " equals " + Arrays.toString(boolValues) + ": " + Arrays.equals(values,boolValues));
        
    }

    public static char getChar(){
        return 'f';
    }
}

