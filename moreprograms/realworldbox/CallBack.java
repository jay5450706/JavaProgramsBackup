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
public interface CallBack {
    
    void callBack(int param);
    
    interface Nested{
    
        void sayGoodBye();
        
        
    }
}
