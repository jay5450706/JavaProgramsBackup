/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanetworking;

/**
 *
 * @author user
 */
import java.awt.BorderLayout;
import javax.swing.*;
import java.io.IOException;
import java.net.Socket;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;




import java.awt.image.BufferedImage;

import java.io.InputStream;

import javax.imageio.ImageIO;

public class RemoteDesktopClient {
    private JFrame frame;
    private JMenuItem syncMenuItem;
    private JMenuItem multiUserMenuItem;
    private JMenuItem recordMenuItem;
    private JMenuItem wifiMenuItem;
    private JMenuItem internetMenuItem;
    private JMenuItem bluetoothMenuItem;
    private JMenuBar menuBar;
    private JMenuItem stop;
    BufferedImage screen;
    private JLabel screenLabel;
    private ImageReceiverThread imageReceiverThread;
    

    public RemoteDesktopClient() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Remote Desktop Client");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and add menu bar
         menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        // Create and add "Connect" menu with submenus
        JMenu connectMenu = new JMenu("Connect");
        menuBar.add(connectMenu);
        //////////////////////////////////////////
        screenLabel = new JLabel();
        frame.add(screenLabel, BorderLayout.CENTER);
        
//           JLabel screenLabel = new JLabel();
//
//        // Add the JLabel to the frame's content pane
//        frame.getContentPane().add(screenLabel, BorderLayout.CENTER);
        
      
        wifiMenuItem = new JMenuItem("Wi-Fi");
        wifiMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle Wi-Fi connection
                showConnectionMessage("Wi-Fi");
            }
        });
        connectMenu.add(wifiMenuItem);

        internetMenuItem = new JMenuItem("Internet");
        internetMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle Internet connection
                showConnectionMessage("Internet");
            }
        });
        connectMenu.add(internetMenuItem);

        bluetoothMenuItem = new JMenuItem("Bluetooth");
        bluetoothMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle Bluetooth connection
               
               JOptionPane.showMessageDialog(frame, "Bluetooth functionality is not implemented.");
          
            }
        });
        connectMenu.add(bluetoothMenuItem);

        // Create and add "SyncMode" menu with submenus
        JMenu syncModeMenu = new JMenu("SyncMode");
        menuBar.add(syncModeMenu);

        syncMenuItem = new JMenuItem("Sync");
        syncMenuItem.setEnabled(false); // Disabled by default
        syncMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle Sync mode
                syncMenuItem.setEnabled(false);
                multiUserMenuItem.setEnabled(true);
                JOptionPane.showMessageDialog(frame, "Sync mode selected.");
            }
        });
        syncModeMenu.add(syncMenuItem);

        multiUserMenuItem = new JMenuItem("MultiUser");
        multiUserMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle MultiUser mode
                multiUserMenuItem.setEnabled(false);
                syncMenuItem.setEnabled(true);
                JOptionPane.showMessageDialog(frame, "MultiUser mode selected.");
            }
        });
        syncModeMenu.add(multiUserMenuItem);

        // Create and add "Record" menu item
        JMenu recordMenu = new JMenu("Record");
        menuBar.add(recordMenu);

        recordMenuItem = new JMenuItem("Record");
        recordMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle Record functionality
                toggleRecording();
            }
        });
        recordMenu.add(recordMenuItem);
        
//        frame.addComponentListener(new ComponentAdapter() {
//            @Override
//            public void componentResized(ComponentEvent e) {
//                updateImageSize(screen);
//            }
//        });
        
        // Add screen area (placeholder)
//        JTextArea screenArea = new JTextArea("Screen Area");
//        frame.add(screenArea);

        frame.setVisible(true);
    }
    
//    private void displayScreen(BufferedImage screen) {
//        
//         
//        
//        if (screen != null) {
//            ImageIcon icon = new ImageIcon(screen);
//            screenLabel.setIcon(icon);
//        }
//    }
//   private void updateImageSize(BufferedImage screen) {
//
//        if (screen != null) {
//            // Get the size of the frame excluding the menu bar
//            int frameWidth = frame.getWidth();
//            int frameHeight = frame.getHeight() - frame.getJMenuBar().getHeight();
//
//            // Calculate the scaling factors
//            double scaleX = (double) frameWidth / screen.getWidth();
//            double scaleY = (double) frameHeight / screen.getHeight();
//
//            // Use the minimum scaling factor to maintain aspect ratio
//            double scale = Math.min(scaleX, scaleY);
//
//            // Scale the image
//            int scaledWidth = (int) (screen.getWidth() * scale);
//            int scaledHeight = (int) (screen.getHeight() * scale);
//            Image scaledImage = screen.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
//
//            // Create ImageIcon from the scaled image
//            ImageIcon icon = new ImageIcon(scaledImage);
//
//            // Set the scaled image as the icon for the label
//            screenLabel.setIcon(icon);
//        }
//    }
    
    //////////////another version of display method
    
    void displayScreen(BufferedImage screen){
    
        
        // Create a JPanel to display the image
        JPanel imagePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Calculate the new dimensions to fit the frame
                int maxWidth = frame.getWidth();
                int maxHeight = frame.getHeight() - menuBar.getHeight();
                int imgWidth = screen.getWidth();
                int imgHeight = screen.getHeight();
                double scaleFactor = Math.min((double) maxWidth / imgWidth, (double) maxHeight / imgHeight);
                int newWidth = (int) (imgWidth * scaleFactor);
                int newHeight = (int) (imgHeight * scaleFactor);

                // Draw the image with the new dimensions
                g.drawImage(screen, 0, 0, newWidth, newHeight, this);
            }
        };

        // Add the image panel to the frame
        frame.add(imagePanel);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //the default display method
//     void displayScreen(BufferedImage screen) {
//    if (screen != null) {
//        // Get the size of the frame excluding the menu bar
//        int frameWidth = frame.getWidth();
//        int frameHeight = frame.getHeight() - frame.getJMenuBar().getHeight();
//
//        // Calculate the scaling factors
//        double scaleX = (double) frameWidth / screen.getWidth();
//        double scaleY = (double) frameHeight / screen.getHeight();
//
//        // Use the minimum scaling factor to maintain aspect ratio
//        double scale = Math.min(scaleX, scaleY);
//
//        // Scale the image
//        int scaledWidth = (int) (screen.getWidth() * scale);
//        int scaledHeight = (int) (screen.getHeight() * scale);
//        Image scaledImage = screen.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
//
//        // Create ImageIcon from the scaled image
//        ImageIcon icon = new ImageIcon(scaledImage);
//
//        // Set the scaled image as the icon for the label
//        screenLabel.setIcon(icon);
//    }
//}
    ///////////////////////////////////////////////////////////////////////////////////////////////////////

//private void displayScreen(BufferedImage screen) {
//    if (screen != null) {
//        // Get the size of the frame
//        int frameWidth = frame.getWidth();
//        int frameHeight = frame.getHeight();
//
//        // Calculate the scaling factor for height
//        double scaleHeight = (double) frameHeight / screen.getHeight();
//
//        // Scale the image only for height to cover the remaining height of the frame
//        int scaledHeight = (int) (screen.getHeight() * scaleHeight);
//        Image scaledImage = screen.getScaledInstance(frameWidth, scaledHeight, Image.SCALE_SMOOTH);
//
//        // Create ImageIcon from the scaled image
//        ImageIcon icon = new ImageIcon(scaledImage);
//
//        // Set the scaled image as the icon for the label
//        screenLabel.setIcon(icon);
//    }
//}

    
//    private void displayScreen(BufferedImage screen) {
//    if (screen != null) {
//        // Calculate the scaling factors
//        double scaleX = (double) screenLabel.getWidth() / screen.getWidth();
//        double scaleY = (double) screenLabel.getHeight() / screen.getHeight();
//        
//        // Use the minimum scaling factor to maintain aspect ratio
//        double scale = Math.min(scaleX, scaleY);
//        
//        // Scale the image
//        int scaledWidth = (int) (screen.getWidth() * scale);
//        int scaledHeight = (int) (screen.getHeight() * scale);
//        Image scaledImage = screen.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
//        
//        // Create ImageIcon from the scaled image
//        ImageIcon icon = new ImageIcon(scaledImage);
//        
//        // Set the scaled image as the icon for the label
//        screenLabel.setIcon(icon);
//    }
//}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
    


    private void showConnectionMessage(String connectionType) {
        //JOptionPane.showMessageDialog(frame, "Connected via " + connectionType);
       
	JDialog dialog = new JDialog(frame, "Connection Settings: " + connectionType, true);
        JPanel panel = new JPanel(new GridLayout(4, 2));

        // Components
        JLabel ipAddressLabel = new JLabel("IP Address:");
        JTextField ipAddressField = new JTextField();
        JLabel serverPasswordLabel = new JLabel("Server Password:");
        JPasswordField serverPasswordField = new JPasswordField();
        JLabel pcPasswordLabel = new JLabel("PC Password:");
        JPasswordField pcPasswordField = new JPasswordField();
        JButton submitButton = new JButton("Submit");
        JButton resetButton = new JButton("Reset");

        // Set button backgrounds to blue
        submitButton.setBackground(Color.BLUE);
        resetButton.setBackground(Color.BLUE);

        // Add components to panel
        panel.add(ipAddressLabel);
        panel.add(ipAddressField);
        panel.add(serverPasswordLabel);
        panel.add(serverPasswordField);
        panel.add(pcPasswordLabel);
        panel.add(pcPasswordField);
        panel.add(submitButton);
        panel.add(resetButton);

        dialog.setLocationRelativeTo(null);
        // Submit button action
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle submit action
                String ipAddress = ipAddressField.getText();
                String serverPassword = new String(serverPasswordField.getPassword());
                String pcPassword = new String(pcPasswordField.getPassword());
                
                // Send credentials to server
                sendCredentialsToServer(ipAddress, serverPassword, pcPassword);

                // Close the dialog
                dialog.dispose();
            }
        });

        // Reset button action
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear all fields
                ipAddressField.setText("");
                serverPasswordField.setText("");
                pcPasswordField.setText("");
            }
        });

        // Add panel to dialog
        dialog.add(panel);
        // Set dialog size
        dialog.setSize(300, 200);
        // Set dialog visibility
        dialog.setVisible(true);
    }
/////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////

    private void sendCredentialsToServer(String ipAddress, String serverPassword, String pcPassword) {
        // Connect to server and send credentials
        try (Socket socket = new Socket(ipAddress, 5000);
		
	 PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
     BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

    // Send serverAddress, pcPassword, and serverPassword to the server for verification
    out.println(ipAddress);
    out.println(serverPassword);
    out.println(pcPassword);
    

    // Receive response from the server
    String messageFromServer = in.readLine();
    
    // Display response from the server
        JOptionPane.showMessageDialog(null, messageFromServer);
        //start receiving screen in the screen area, below JMenu bar
        
        
        //////////////////////////////////////////////////////////
       screen = receiveScreenFromServer(socket);
       displayScreen(screen);
       //////////////////////////////////////////////////////////
		
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Error sending credentials to server: " + e.getMessage());
        }
        
    }
    private void toggleRecording() {
        if (recordMenuItem.getText().equals("Record")) {
            startRecording();
        } else {
            stopRecording();
        }
    }

    private void startRecording() {
        // Implement screen recording functionality
        recordMenuItem.setText("Stop Recording");
        JOptionPane.showMessageDialog(frame, "Recording started.");
        // Start recording...
    }

    private void stopRecording() {
        // Implement stopping recording functionality
        recordMenuItem.setText("Record");
        JOptionPane.showMessageDialog(frame, "Recording stopped and saved.");
        // Stop recording...
    }
    
   
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RemoteDesktopClient();
            }
        });
    }
}
