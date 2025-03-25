/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import java.util.Date;

/**
 *
 * @author user
 */
public class Transaction {
    private char type; //W, D
    private double amount;
    private double balance;
    private Date date;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        
        this.date = new Date();
        
    }

    public char getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Transaction{" + "type=" + type + ", amount=" + amount + ", balance=" + balance + ", date=" + date + ", description=" + description + '}';
    }
    
    
    
    
}
