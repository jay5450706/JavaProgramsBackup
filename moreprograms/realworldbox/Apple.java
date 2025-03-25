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
public enum Apple {
    Jonathan(10),GoldenDel(20),RedDel(50),Winesap(30), Cortland(80);
    
    int price;
    
    Apple(int price){
        this.price = price;
    }
}
