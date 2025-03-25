/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanetworking;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import javax.imageio.ImageIO;

/**
 *
 * @author user
 */
public class ImageReceiverThread extends Thread{
    private final Socket serverSocket;
    private volatile boolean stopReceiving = false;
    private final RemoteDesktopClient displayClass; // Replace with your actual display class

    public ImageReceiverThread(Socket serverSocket, RemoteDesktopClient displayClass) {
        this.serverSocket = serverSocket;
        this.displayClass = displayClass;
    }

    @Override
    public void run() {
        try {
            while (!stopReceiving) {
                BufferedImage screen = receiveScreenFromServer(serverSocket);

                // Process the received screen image as needed
                // (e.g., display it on a UI component)
                if (screen != null) {
                    displayClass.displayScreen(screen);
                }

                // Add a delay to control the rate of receiving images
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Method to stop receiving images from the server
    public void stopReceiving() {
        stopReceiving = true;
    }

    private BufferedImage receiveScreenFromServer(Socket serverSocket) {
        try {
            InputStream inputStream = serverSocket.getInputStream();
            BufferedImage screen = ImageIO.read(inputStream);

            System.out.println("Screen received from server");

            return screen;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
