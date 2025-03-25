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
public class ClientOfInterface implements CallBack, CallBack.Nested{
    
    int a;
    @Override
    public void callBack(int p){
       System.out.println("Callback called with " + p);
    }
    @Override
     public void sayGoodBye(){
         System.out.println("Good Bye!");
     }
    
    void sayGoodMorning(){
        System.out.println("Good Morning");
    }
}
