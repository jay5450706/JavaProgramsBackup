/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarevisionproject;

/**
 *
 * @author user
 */

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class DisplayImage extends JFrame {
    
    JLabel label;
    Image scaledImage;
    ImageIcon scaledIcon;
    static BufferedImage storedImage;
    private JMenuBar menuBar;
    private JMenuItem wifiMenuItem;
    private JMenuItem internetMenuItem;
    private JMenuItem bluetoothMenuItem;
    int frameWidth = 800;  // Set the desired width of the frame
    int frameHeight = 600;
    
    //another constructor version for faster load
//    public DisplayImage(BufferedImage image) {
//        this.storedImage = image;
//
//        setTitle("Stored Image Display");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        label = new JLabel();
//        label.setBorder(BorderFactory.createLineBorder(Color.BLUE));
//        getContentPane().add(label, BorderLayout.CENTER);
//
//        // Load and display the image in a separate thread
//        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
//            @Override
//            protected Void doInBackground() {
//                // Scale the image to fit the frame without compromising quality
//                scaledImage = storedImage.getScaledInstance(frameWidth, frameHeight, Image.SCALE_SMOOTH);
//                scaledIcon = new ImageIcon(scaledImage);
//                label.setIcon(scaledIcon);
//                label.setPreferredSize(new Dimension(frameWidth, frameHeight));
//                pack();
//                return null;
//            }
//
//            @Override
//            protected void done() {
//                setLocationRelativeTo(null); // Center the frame on the screen
//            }
//        };
//
//        worker.execute();
//
//        // Add a ComponentListener to handle frame resizing
//        addComponentListener(new ComponentAdapter() {
//            @Override
//            public void componentResized(ComponentEvent e) {
//                updateImageSize(getWidth(), getHeight());
//            }
//        });
//    }
//    
    //main constructor
    public DisplayImage(BufferedImage image) {
        setTitle("Stored Image Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Create and add "Connect" menu with submenus
        JMenu connectMenu = new JMenu("Connect");
        menuBar.add(connectMenu);
        wifiMenuItem = new JMenuItem("Wi-Fi");
        connectMenu.add(wifiMenuItem);
        
        internetMenuItem = new JMenuItem("Internet");
        connectMenu.add(internetMenuItem);

        bluetoothMenuItem = new JMenuItem("Bluetooth");
        connectMenu.add(bluetoothMenuItem);

        // Create and add "SyncMode" menu with submenus
        JMenu syncModeMenu = new JMenu("SyncMode");
        menuBar.add(syncModeMenu);

        // Scale the image to fit the frame without compromising quality
         // Set the desired height of the frame
        frameHeight = frameHeight  - menuBar.getHeight();
        scaledImage = image.getScaledInstance(frameWidth, frameHeight, Image.SCALE_SMOOTH);
        scaledIcon = new ImageIcon(scaledImage);

        label = new JLabel(scaledIcon);
        label.setPreferredSize(new Dimension(frameWidth, frameHeight));
        label.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        getContentPane().add(label, BorderLayout.CENTER);

        pack(); // Adjust frame size based on preferred size of components
        setLocationRelativeTo(null); // Center the frame on the screen
        
        // Add a ComponentListener to handle frame resizing
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                updateImageSize(getWidth(), getHeight());
            }
        });
        
    }
    //version 3
    private void updateImageSize(int width, int height) {
    if (width > 0 && height > 0) {
        // Scale the image to fit the frame without compromising quality
        frameWidth = width - 16;
        frameHeight = height - (39 + menuBar.getHeight());

        BufferedImage resizedImage = new BufferedImage(frameWidth, frameHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resizedImage.createGraphics();

        // Enable anti-aliasing
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        g2d.drawImage(storedImage, 0, 0, frameWidth, frameHeight, null);
        g2d.dispose();

        scaledIcon = new ImageIcon(resizedImage);
        label.setIcon(scaledIcon);
        label.setPreferredSize(new Dimension(frameWidth, frameHeight));
    }
}

   //version 2 
//    private void updateImageSize(int width, int height) {
//    if (width > 0 && height > 0) {
//        // Scale the image to fit the frame without compromising quality
//        frameWidth = width - 16;
//        frameHeight = height - 39;
//
//        BufferedImage resizedImage = new BufferedImage(frameWidth, frameHeight, BufferedImage.TYPE_INT_ARGB);
//        Graphics2D g2d = resizedImage.createGraphics();
//        g2d.drawImage(storedImage, 0, 0, frameWidth, frameHeight, null);
//        g2d.dispose();
//
//        scaledIcon = new ImageIcon(resizedImage);
//        label.setIcon(scaledIcon);
//        label.setPreferredSize(new Dimension(frameWidth, frameHeight));
//    }
//}

    //main method
//  private void updateImageSize(int width, int height) {
//        if (width > 0 && height > 0) {
//            // Scale the image to fit the frame without compromising quality
//            frameWidth = width - 16;
//            frameHeight = height - 39;
//            scaledImage = storedImage.getScaledInstance(frameWidth, frameHeight, Image.SCALE_SMOOTH);
//            label.setPreferredSize(new Dimension(frameWidth, frameHeight));
//            scaledIcon = new ImageIcon(scaledImage);
//            label.setIcon(scaledIcon);
//        }
//    }  

    public static void main(String[] args) {
        try {
            // Specify the file path for the stored image
            String filePath = "C:\\Users\\user\\Desktop\\Books\\Java\\Java_Excercises\\JavaRevisionProject\\src\\javarevisionproject\\desktop_capture.png";

            // Load the stored image
           storedImage = ImageIO.read(new File(filePath));

            // Create and display the frame to show the stored image
            SwingUtilities.invokeLater(() -> {
                DisplayImage frame = new DisplayImage(storedImage);
                frame.setVisible(true);
                System.out.println("Frame Size: " + frame.getWidth() + " x " + frame.getHeight());
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

