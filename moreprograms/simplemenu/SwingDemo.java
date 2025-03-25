/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplemenu;
import javax.swing.*;


/**
 *
 * @author user
 */
public class SwingDemo {

    SwingDemo(){
        
        JFrame jfrm = new JFrame("A Simple Swing Application");
        
        jfrm.setSize(275, 100);
        
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel jlab = new JLabel(" Swing means powerful GUIs. ");
        
        jfrm.add(jlab);
        
        jfrm.setVisible(true);
        
        
    
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
            new SwingDemo();
            }
        });
        // TODO code application logic here
    }
    
}
