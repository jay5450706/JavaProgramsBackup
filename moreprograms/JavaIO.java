/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciseonjavaio;

//import java.net.InetAddress;
//import java.net.UnknownHostException;

/**
 *
 * @author user
 */

//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
//import java.io.PrintStream;
//import java.util.Arrays;
public class JavaIO {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
        
        try{
            InetAddress myPc = InetAddress.getLocalHost();
            System.out.println(myPc);
        }catch(UnknownHostException e){
        
        }
     
        int a = 5;
        System.out.println(a);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
//        try(FileWriter file = new FileWriter("C:\\Users\\user\\Desktop\\OtherDocuments\\Jairus\\Physics\\writing.txt",true)){
//        
//            file.write("12345");
//            file.write(" is not my phone number");
//        
//        }catch(IOException e){
//            System.out.println("Exception caught");
//        }
//        
//        try(FileReader file = new FileReader("C:\\Users\\user\\Desktop\\OtherDocuments\\Jairus\\Physics\\writing.txt")){
//       
//            int a;
//            while((a = file.read()) != -1){
//                System.out.print((char)a);
//            }
//        
//        }catch(IOException e){
//            System.out.println("Exception caught");
//        }
        
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
//        try(FileOutputStream file = new FileOutputStream("C:\\Users\\user\\Desktop\\OtherDocuments\\Jairus\\Physics\\waves.txt")){
//                DataOutputStream data = new DataOutputStream(file);
//                DataOutputStream data2 = new DataOutputStream(new FileOutputStream("C:\\\\Users\\\\user\\\\Desktop\\\\OtherDocuments\\\\Jairus\\\\Physics\\\\test.dat"));
//                
//                data.writeInt(456);
//                data.writeDouble(4.23);
//                data.writeChar('J');
//                data.writeBoolean(true);
//                
//                data2.writeInt(789);
//                data2.writeDouble(5.55);
//                data2.writeChar('K');
//                data2.writeBoolean(false);
//                
//        }catch(IOException e){
//            System.out.println("IO exception caught");
//        }
//        
//        try(DataInputStream data = new DataInputStream(new FileInputStream("C:\\Users\\user\\Desktop\\OtherDocuments\\Jairus\\Physics\\waves.txt"));
//            DataInputStream data2 = new DataInputStream(new FileInputStream("C:\\Users\\user\\Desktop\\OtherDocuments\\Jairus\\Physics\\test.dat"))){
//            
//            int a = data.readInt();
//            double b = data.readDouble();
//            char c = data.readChar();
//            boolean d = data.readBoolean();
//            
//            int e = data2.readInt();
//            double f = data2.readDouble();
//            char g = data2.readChar();
//            boolean h = data2.readBoolean();
//            
//            System.out.println(a + " " + b + " " + c + " " + d);
//            System.out.println(e + " " + f + " " + g + " " + h);
//            
//            
//        
//        }catch(IOException e){
//            System.out.println("IOException: " +e.getMessage());
//        }
        ///////////////////////////////////////////////////////////////////////////////////////////
//        
//        String[] names = {"James","Peter","Samson"};
//        
//        File linearMotionObj = new File("C:\\\\Users\\\\user\\\\Desktop\\\\OtherDocuments\\\\Jairus\\\\Physics\\\\LinearMotion.txt");
//        
//        try{
//            PrintStream outPut = new PrintStream(linearMotionObj);
//            outPut.println(Arrays.toString(names));
//            outPut.println(4);
//            outPut.println(5);
//        }catch(IOException e){
//            System.out.println("Exception caught" + e.getMessage());
//        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////
//        
//        InetAddress address = InetAddress.getLocalHost();
//        System.out.println(address);
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////
        
        /*why is that when writing to a file using FileOutputStream class, writing
        values for example 4, 5, 6 displays some weird characters in the .txt file
        but when you read the data using FileInputStream the values are displayed 4, 5 , 6
        I mean why can't the notepad display the values?*/
        
        /*If you write a number in a notepad can be displayed?*/
        
//        try(FileInputStream file1 = new FileInputStream("C:\\Users\\user\\Desktop\\OtherDocuments\\Harry\\readwrite.txt")){
//            
//            int dataRead;
//            while((dataRead = file1.read()) != -1 ){
//                System.out.println(dataRead);
//            }
//        
//        }catch(IOException e){
//                System.out.println("IOException caught two" + e);
//        }
//        
//        try(FileOutputStream file = new FileOutputStream("C:\\Users\\user\\Desktop\\\\OtherDocuments\\Harry\\readwrite.txt",true)){
//            file.write(5);
//            file.write(7);
//            file.write(8);
//            file.write(9);
//            file.write(6);
//            
//        }catch(IOException e){
//            System.out.println("IOException caught one " + e);
//        }
//        
//        try(FileInputStream file1 = new FileInputStream("C:\\Users\\user\\Desktop\\OtherDocuments\\Harry\\readwrite.txt")){
//            
//            int dataRead;
//            while((dataRead = file1.read()) != -1 ){
//                System.out.println(dataRead);
//            }
//        
//        }catch(IOException e){
//                System.out.println("IOException caught two" + e);
//        }
//        System.out.println();
//        String name = "Jimmy";
//        byte buf[] = name.getBytes();
//        System.out.println(buf[0]);
        //////////////////////////////////////////////////////////////////////////////////
        
//        File myFirstDirectoryObject = new File("C:\\Users\\user\\Desktop\\OtherDocuments\\Harry");
//        File fileInJairus = new File("C:\\Users\\user\\Desktop\\OtherDocuments\\Jairus\\Physics\\LinearMotion.txt");
//        
//        System.out.println("Parent Directory: " + fileInJairus.getParent());
//        System.out.println("Path: " + fileInJairus.getPath());
//        System.out.println("Absolute Path: " + fileInJairus.getAbsolutePath());
//        
//        if(fileInJairus.isDirectory())
//            System.out.println("it is directory");
//        else if(fileInJairus.isFile())
//            System.out.println("it is file");
//            
//        System.out.println("Size " + fileInJairus.length());
//        
//        String[] listOfFiles = myFirstDirectoryObject.list();
//        
//        for(String s:listOfFiles)
//            System.out.println(s);
        // TODO code application logic here
    }
    
}
