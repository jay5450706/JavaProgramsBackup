package mypackage;

import java.util.ArrayList;

public class JavaArrayLists {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add(1,"Mango");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pawpaw");

        System.out.println(fruits);

        fruits.remove(4);

        System.out.println(fruits);

        fruits.remove("Orange");

        System.out.println(fruits);
        System.out.println(fruits.size());

        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 5; i < 15; i += 2){
            numbers.add(i);
        }

        System.out.println(numbers);

        for(Integer i:numbers){
            System.out.print(i + " ");
        }

        for(int i:numbers){
            System.out.print(i + " ");
        }

        // fruits.clear();
        // System.out.println(fruits);
    }


}
