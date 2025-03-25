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
public class Credentials implements java.io.Serializable {
    private String serverPassword;
    private String pcPassword;

    public Credentials(String serverPassword, String pcPassword) {
        this.serverPassword = serverPassword;
        this.pcPassword = pcPassword;
    }
}
