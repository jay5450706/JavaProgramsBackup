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
public class AnotherClientInterface implements CallBack {
    
    
    @Override
    public void callBack(int p){
        System.out.println("Another version of callback");
        System.out.println("The square of " + (p*p));
    }
    
}
