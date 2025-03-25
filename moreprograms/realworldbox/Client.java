/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realworldbox;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Client {
    
    private int id;
    private String name;
    private String phone;
    private ArrayList<Account> accounts;
    
    public Client(int id, String name, String phone){
        this.id = id;
        this.name = name;
        this.phone = phone;
        
        
        accounts = new ArrayList<>();
    }
    
    public boolean addAccount(Account account){
        accounts.add(account); //account[0] references account object
        return true;
    }
    
    public boolean removeAccount(int accountId){
        for(Account account:accounts){
            if(account.getId() == accountId){
                accounts.remove(account);
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString(){
        String s = this.id + " " + this.name + " " + this.phone + " " + "\n";
        
        for(Account account:accounts)
            s += account.toString() + "\n";
        
        return s;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    
    
}
