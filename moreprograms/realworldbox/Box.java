/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realworldbox;

/**
 *
 * @author user
 */
public class Box {
    private double width;
    private double height;
    private double depth;
    Test ob = new Test(1, 2);
    static int b = 1;
    int c = 10;
   
    
    
    class Inner{
        public int a;
        
        
        double b = volume();
        void showC(){
            class InMethod{
                int d;
                
            }
            System.out.println(b);
        
        }
    
    }
    
    
    public int boxNumber = 2;
    
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
        
    }
    
    Box(double w, double h, double d){
       width = w;
       height = h;
       depth = d;
    }
    
    Box(){
        width = -1;
        height = -1;
        depth = -1;
        
    }
    
    Box(double len){
        width = height = depth = len;
        
    }
    public void useStaticVariable(final int a){
        System.out.println(Test.c);
    }
    
    double volume(){
     return this.width * this.height * this.depth;
    }
}
