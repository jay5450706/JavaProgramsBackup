/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanetworking;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author user
 */
public class Networking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            InetAddress address1 = InetAddress.getLocalHost();
            System.out.println(address1);
            
            InetAddress address2 = InetAddress.getByName("www.facebook.com");
            System.out.println(address2);
            
            InetAddress address3 = InetAddress.getByName("www.javatpoint.com");
            System.out.println(address3);
            
            InetAddress address4 = InetAddress.getByName("www.google.com");
            System.out.println(address4);
            
            String ipAddressString = "102.132.104.35";
            
            
            String[] octets = ipAddressString.split("\\.");
            
            
            byte[] ipAddress = new byte[4];
            
            
            for (int i = 0; i < 4; i++) {
                int octet = Integer.parseInt(octets[i]);
                ipAddress[i] = (byte) octet;
            }
            
            InetAddress address5 = InetAddress.getByAddress(ipAddress);
            System.out.println(address5.getHostName());
            
            
            
            
        
        }catch(UnknownHostException e){
            System.out.println("Unknown Host");
        }
        // TODO code application logic here
    }
    
}
