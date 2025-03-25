/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realworldbox;

//import java.util.ArrayList;

import java.util.ArrayList;

//import java.util.Scanner;

/**
 *
 * @author user
 */

class GenMethDemo{
    static<T /*extends Comparable<T>*/, V extends T> boolean isIn(T x, V[] y){
        for(int i = 0; i < y.length;i++){
            if(x.equals(y[i])) return true;
        }
        
        System.out.println(y[2]);
        return false;
        
    }
    
    static <Z extends Number> void showNumber(Z y){
            System.out.println(y);
    }
}
//class Example{
//    
//    public<T , U extends T> void printValues(T value1, U value2){
//            System.out.println("Value1: " + value1);
//            System.out.println("Value2: " + value2);
//    }
//
//}

//class A{
//    synchronized void foo(B1 b){
//        String name = Thread.currentThread().getName();
//        
//        System.out.println(name + " entered A.foo");
//        
//        try{
//            Thread.sleep(1000);
//        }catch(Exception e){
//            System.out.println("A Interrupted");
//        }
//        
//        System.out.println(name + " trying to call B.last()");
//        b.last();
//    }
//    
//    synchronized void last(){
//        System.out.println("Inside A.last");
//    }
//}
//
//class B1{
//    synchronized void bar(A a){
//        String name = Thread.currentThread().getName();
//        System.out.println(name + " entered B.bar");
//        
//        try{
//            Thread.sleep(1000);
//        }catch(InterruptedException e){
//            System.out.println("B interrupted");
//        }
//        
//        System.out.println(name + " trying to call A.last()");
//        a.last();
//         
//    }
//     synchronized void last(){
//            System.out.println("Inside A.last");
//        }
//
//}
//class SharedBuffer {
//    private int data;
////    private boolean available = false; // Initially, no data is available
//
//    synchronized int get() {
//        // Wait until data is available
////        while (!available) {
////            try {
////                wait(); // Wait until notified by producer
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
////        }
////        available = false; // Mark data as consumed
////        notify(); // Notify producer that consumer has consumed data
//        return data; // Return the consumed data
//    }
//
//    synchronized void put(int value) {
//        // Wait until data is consumed
////        while (available) {
////            try {
////                wait(); // Wait until notified by consumer
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
////        }
//        data = value; // Set the new data value
////        available = true; // Mark data as available
////        notify(); // Notify consumer that producer has produced data
//    }
//}
//
//class Producer1 implements Runnable {
//    private SharedBuffer buffer;
//
//    Producer1(SharedBuffer buffer) {
//        this.buffer = buffer;
//        new Thread(this, "Producer").start();
//    }
//
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            buffer.put(i); // Produce data and add to buffer
//            System.out.println("Produced: " + i);
//        }
//    }
//}
//
//class Consumer1 implements Runnable {
//    private SharedBuffer buffer;
//
//    Consumer1(SharedBuffer buffer) {
//        this.buffer = buffer;
//        new Thread(this, "Consumer").start();
//    }
//
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            int value = buffer.get(); // Consume data from buffer
//            System.out.println("Consumed: " + value);
//        }
//    }
//}

/////////////////////////////////////////////////

interface MyInterface<T>{
    T getValue(T y);
}
////////////////////////////////////////////

public class Main /*implements Runnable*/ {

    /**
     * @param args the command line arguments
     */
    /*
    Put: 1
    Got: 1
    Got: 1
    Got: 1
    Got: 1
    Got: 1
    Put: 2
    Put: 3
    Put: 4
    Put: 5
    Put: 6
    Put: 7
    Got: 7
    
    */
//    A a = new A();
//    B1 b = new B1();
//       
//    Main(){
//        
//        Thread.currentThread().setName("MainThread");
//        Thread t = new Thread(this, "RacingThread");
//        t.start();
//        
//        a.foo(b);
//        System.out.println("Back in main thread");
//    }
//    
//    public void run(){
//    
//        b.bar(a);
//        System.out.println("Back in other thread");
//        
//    }
    
  public static String processor(MyInterface<String> name,String surname){
      return name.getValue(surname);
  }
   public static void main(String[] args) {
       
       MyInterface<Double> doubleNum = new MyInterface<Double>(){
            @Override
            public Double getValue(Double d){
                return d;
            }
       };
       System.out.println(doubleNum.getValue(12.1));
       
       MyInterface<String> myString = (str)-> str;
       System.out.println(myString.getValue("Introduction to Lambda Expressions"));
       
       MyInterface<String> mySecondString = (str)-> {
           String surname = "Dzombo";
           return str + " " + surname;
       };
       
       MyInterface<Integer> num = (n)-> {
                    return n;
               };
       
       int z = num.getValue(42);
       System.out.println(z);
       
       Integer[] integers = new Integer[5];
       
       ArrayList<Integer> numbers = new ArrayList<>();
       numbers.add(2);
   }     
       /////////////////////////////////////////////////////////////////////////////////////
       
//       Float value1 = new Float("2.4f");
//       System.out.println(value1);
//       
//       int number = 568;
//       
//       String s = Integer.toBinaryString(number);
//       
//       System.out.println(s);
       
       //for example I have a class "MyClass" , this MyClass is an object of the class "Class" thus MyClass contains methods and fields of "Class". then we have another class in Java called Void, this class has an instance variable (I don't know if its final or static, you will clarify)  TYPE, continue explaining and critique my understanding


       ////////////////////////////////////////////////
       
//       GenMethDemo.showNumber(5);
       //////////////////////////////////////////////////////////////////////////////
//       public static void main(String[] args){
//       
//       Integer nums[] = {1,2,3,4,5};
//       
//       if(GenMethDemo.isIn(2,nums))
//           System.out.println("2 is in nums");
//       
//       if(!GenMethDemo.isIn(7, nums))
//           System.out.println("7 is not in nums");
//       
//       String strs[] = {"one", "two", "three", "four", "five"};
//       
//       if(GenMethDemo.isIn("two", strs))
//           System.out.println("two is in strs");
//       
//       if(GenMethDemo.isIn("two", nums))
//            System.out.println("two is not");
//       
//       Double doubles[] = {1.1,2.2,5.5};
//       
//       if(GenMethDemo.isIn(1.1, nums))
//           System.out.println("T is double v is integer");
//       
//       if(GenMethDemo.isIn(1, doubles))
//           System.out.println("T is double v is integer");
//       }
       ////////////////////////////////////////////////////////////////
//       Example example = new Example();
//       
//       example.printValues("Hello","World");
//       example.printValues(10,20);
//       example.printValues(15.2,20);
//       example.printValues("Java",2022);
//       
       //////////////////////////////////////////////////////////////////////
       
//       
//       new Main();
       
//       SharedBuffer buffer = new SharedBuffer();
//        new Producer1(buffer); // Start producer thread
//        new Consumer1(buffer); // Start consumer thread
//       
       ////////////////////////////////////////////////////////////////
       
//       Q q = new Q();
//       new Producer(q);
//       new Consumer(q);
//       
//       System.out.println("Press Control-c to stop");
       ////////////////////////////////////////////////////////////////
//       try{
//           ExceptionDemo.compute(1);
//           ExceptionDemo.compute(20);
//       }catch(MyException e){
//           System.out.println("Caught " + e);
//       }
       
       ////////////////////////////////////////////////////////////////////
       
//       Callme target = new Callme();
//       Caller ob1 = new Caller(target, "Hello","one");
//       Caller ob2 = new Caller(target, "Synchronized","two");
//       Caller ob3 = new Caller(target, "World","three");
//       
//       //wait for threads to end
//       
//       try{
//           ob1.t.join();
//           ob2.t.join();
//           ob3.t.join();
//       }catch(InterruptedException e){
//           System.out.println("Interrupted");
//       }
      //////////////////////////////////////////////////////////////// 
      
//       TwoD td[] = {
//           
//           new TwoD(0,0),
//           new TwoD(7,9),
//           new TwoD(18,4),
//           new TwoD(-1, -23)
//       
//       };
//       System.out.println("Printing elements of Array td");
//       for(int i = 0;i < td.length; i++){
//           System.out.println(td[i].x + " " + td[i].y);
//       }
//       
//       for(TwoD coordinates:td)
//           System.out.println(coordinates.x + " " + coordinates.y);
//       
//       
//       
//       Coords<TwoD> tdlocs = new Coords<TwoD>(td);
//       
//       System.out.println("Printing coords array");
//       for(int i = 0;i < tdlocs.coords.length;i++){
//           System.out.println(tdlocs.coords[i].x + " " + tdlocs.coords[i].y);
//       }
//       
//       
//       for(TwoD xy:tdlocs.coords)
//           System.out.println(xy.x + " " + xy.y);
//           
//       
//       Coords.showXY(tdlocs);
//       
//       
//       ThreeD[] threeD  = new ThreeD[3];
//       threeD[0] = new ThreeD(1,2,3);
//       threeD[1] = new ThreeD(4,5,6);
//       threeD[2] = new ThreeD(7,8,9);
//       
//       
//       
//      Coords<ThreeD> threeDim = new Coords<ThreeD>(threeD);
//      System.out.println("Printing X and Y three dimension array coordinates");
//      Coords.showXY(threeDim);
//      
//      System.out.println("Printing all coordinates of 3D");
//      Coords.showXYZ(threeDim);
//       
//       
//       
//       
//       //////////////////////////////////////////////////////////////////////
//       
//       Integer inums[] = {1, 2, 3, 4, 5 };
//       Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5 };
//       
//       Stats<Integer> iob = new Stats<Integer>(inums); //redundant - remove the second Integer
//       Stats<Double> dob = new Stats<>(dnums);
//       iob.sameAvg(dob);
//       iob.printArray();
//       dob.printArray();
//
//       
//       
       //////////////////////////////////////////////////////////////////////////
       
//       TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");
//       
//       tgObj.showTypes();
//       
//       int v = tgObj.getob1();
//       System.out.println("Value: " + v);
//       
//       String str = tgObj.getob2();
//       System.out.println("Value: " + str);
       //////////////////////////////////////////////////////////
       
//       Integer iob = new Integer(100);
//       
//       String s = iob.toString();
//       
//       System.out.println(s);
//       
//       int i = iob.intValue();
//       
//       System.out.println(i);
       
       /////////////////////////////////////////////////////////////////////////////////////////////////////////////
  
//       Apple ap;
//     ap = Apple.Cortland;
//     
//     int ordinal = Apple.RedDel.ordinal();
//     Apple anotherType = Apple.GoldenDel;
//    
//    System.out.println("Value of ap: " + ap);
//    System.out.println("Value of anotherType: " + anotherType);
//    
//    
//    if(ap == Apple.Cortland)
//        System.out.println("ap contains Cortland");
//    
//    switch(ap){
//    
//        case Jonathan:
//            System.out.println("Jonathan is red.");
//            break;
//        case GoldenDel:
//            System.out.println("Golden Delicious is yellow");
//            break;
//        case RedDel:
//            System.out.println("Red Delicious is red.");
//            break;
//        case Winesap:
//            System.out.println("Winesap is red");
//            break;
//        case Cortland:
//            System.out.println("Cortlan is red");
//            
//    }
//    
     ////////////////////////////////////////////////////
//        
//        new NewThread();
//        
//        try{
//            for(int i = 5; i > 0; i--){
//                System.out.println("Main Thread: " + i);
//                Thread.sleep(1000);
//            }
//        
//        }catch(InterruptedException e){
//            System.out.println("Main thread interrupted.");
//        
//        }
//        System.out.println("Main thead exiting");
//        
//        
    /////////////////////////////////////////////    
//        CallBack typeInterfaceObject = new CallBack() {
//
//            //anonymous class
//            @Override
//            public void callBack(int param) {
//                System.out.println("I am a method in anonymous class " + param);
//            }
//        };
//        
//        typeInterfaceObject.callBack(2);
//        
//        CallBack c = new ClientOfInterface();
//        AnotherClientInterface ob = new AnotherClientInterface();
//        CallBack.Nested example = new ClientOfInterface();
//        
//        c.callBack(42);
//        example.sayGoodBye();
//        
//        
//        ((ClientOfInterface)c).sayGoodMorning();
//        ((ClientOfInterface)c).a = 1;
//        
//         c = ob;
//         c.callBack(42);
//         
        
        
        ///////////////////////////////////////////////
//        new Main().sayHi();
//        //Array of objects - printe
//        
//        ArrayList<Rectangle> rectangles = new ArrayList<>();
//        rectangles.add(new Rectangle(5,6));
//        rectangles.add(new Rectangle(8,4));
//        rectangles.add(new Rectangle(9,1));
//        Rectangle rec1 = rectangles.get(1);
//       
//        Scanner input = new Scanner(System.in);
//        char choice;
//        choice = input.next().charAt(0);
//        while(choice != 'n'){
//         
//        
//        }
//        
//        for(Rectangle rectangle:rectangles){
//            
//        }
//        
//        System.out.println(rectangles.toString());
//        
//        for(int i = 0;i < rectangles.size();i++){
//            System.out.println("The width and height of rectangle: " + (i+1) + "| " + (rectangles.get(i)).getWidth() + " " + rectangles.get(i).getHeight());
//        }
//        
//        System.out.println("Printing using a for each loop");
//        
//        int i = 1;
//        for(Rectangle rectangle:rectangles){
//            System.out.println("Rectangle: " + i + " | " + rectangle.getWidth() + " " + rectangle.getHeight());
//            i++;
//        }
        //System.out.println(rectangles.get(0).getHeight());
        
        ///////////////////////////////////////////////
        
//       Rectangle[] rectangles = new Rectangle[3];
//        
//        Scanner input = new Scanner(System.in);
//        
//        for(int i = 0;i < rectangles.length;i++){ //can we use for each loop here?
//            System.out.println("Enter the height and width of rectangle " + (i + 1));
//            rectangles[i] = new Rectangle(input.nextDouble(),input.nextDouble()); 
//        }
//        
//        for(int i = 0; i < rectangles.length;i++){
//            System.out.println("The width and height of rectangle: " + (i+1) + " " + rectangles[i].getWidth() + " " + rectangles[i].getHeight());
//        }
//        
//        System.out.println("Printing using for each loop");
//        
//        int i = 1;
//        for(Rectangle rectangle:rectangles){
//            System.out.println("Rectangle " + i + " | " + rectangle.getHeight() + rectangle.getWidth());
//            i++;
//        }
        
        //rectangles[0] = new Rectangle(5,4);
        
        
        
        ///////////////////////////////////////////////////////////////
        
//        ArrayList<String> fruits = new ArrayList<>();
//        
//        fruits.add("Mango");
//        fruits.add("Banana");
//        fruits.add("Pinneaple");
//        fruits.add("Banana");
//        fruits.add("Apple");
//        
//        System.out.println(fruits);
//        
//        fruits.remove("Banana");
//        
//        System.out.println(fruits);
//        
//        System.out.println(fruits.size());
        
   /////////////////////////////////////////////////////////////////////////     
//        int[] integers;
//        integers = new int[5];
//        
//        String[] names = new String[5];
//        
//        Scanner input = new Scanner(System.in);
//        
//        System.out.println(integers.length);
//        System.out.println(names.length);
//        
//        for(int i = 0; i < integers.length; i++){
//            integers[i] = i+1;
//    }
//        
//        for(int i = 0; i < names.length; i++){
//            System.out.println("Enter name " + (i+1));
//            names[i] = input.nextLine();
//        }
//        
//        for(int i = 0; i < integers.length; i++){
//            System.out.print(integers[i] + " ");
//        }
//        
//        System.out.println("Printing using for each loop");
//        
//        for(int item:integers){
//            System.out.print(item + " ");
//        }
//        
//        for(String item:names){
//            System.out.print(item + " | ");
//        }
//        // TODO code application logic here
    }
    
//    public void sayHi(){
//        System.out.println("Hi James");
//    }
//   
//    
//}
