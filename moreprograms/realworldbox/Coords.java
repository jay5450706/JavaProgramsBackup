/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realworldbox;

/**
 *
 * @author user
 * @param <T>
 */
public class Coords<T extends TwoD> {
    T[] coords;//T becomes TwoD[] coords
    
    
    Coords(T[] o){//td reference is passed here therefore td and o point to the same array
        coords = o;
    }
    
    static void showXY(Coords<?> c){/*when called tdlocs reference is passed here thus c and tdlocs refer to same object of class Coords, thus
        c also has same instance variables as tdlocs with the same state and methods*/
        System.out.println("X Y Coordinates: ");
        for(int i = 0;i < c.coords.length;i++){//therefore c.coords means we are accessing coords instance variable of tdlocs or c
            System.out.println(c.coords[i].x + " " +  c.coords[i].y);/*since coords is an array of objects of TwoD references, c.coords[0] accesses the 
            first reference and c.coords[0].x accesses the first instance variable of TwoD */
        }
       
            
    }
    
    static void showXYZ(Coords<? extends ThreeD> c){
        for(int i = 0;i < c.coords.length;i++){
            System.out.println(c.coords[i].x + " " + 
                    c.coords[i].y + " " + 
                    c.coords[i].z);
        }
    }
    
    void printArrayElements(){
        for(int i  = 0;i < coords.length;i++){
                System.out.println(coords[i].x + " " + coords[i].y);
        }
        
        for(T numbers:coords)
            System.out.println(numbers.x + numbers.y);
    }
    
}
