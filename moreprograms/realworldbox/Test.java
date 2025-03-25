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
public class Test {
    
    int a, b;
    static int c = 1;
    
    Test(int i, int j){
        a = i;
        b = j;
        
    }
    
    boolean equalTo(Test o){
        System.out.println("o.a " + o.a);
        System.out.println("o.b " + o.b);
        System.out.println("a " + a);
        System.out.println("b " + b);
        return o.a == a && o.b == b;
    }
    
    public void useStaticVariable(){
        System.out.println(c);
    }
    
    
}
