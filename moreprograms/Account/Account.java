/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author user
 */
public class Account {
    private int id;
    private double balance;
//    private double annualInterestRate;
    private Date dateCreated;
    private Client client;
    protected ArrayList<Transaction> transactions;
    
    public Account(int id, double balance, Client client){ //double annualInterestRate,
        this.id = id;
        this.balance = balance;
//        this.annualInterestRate = annualInterestRate;
        this.client = client;
        
        this.transactions = new ArrayList<>();
        dateCreated = new Date();
        
    }
    
    public boolean withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            this.transactions.add(new Transaction('W',amount,this.balance,"Withdrawn " + amount));
          return true;
        }
        else
            return false;
    }
    
    public void deposit(double amount){
        balance += amount;
        this.transactions.add(new Transaction('D',amount,this.balance,"Deposited " + amount));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

//    public double getAnnualInterestRate() {
//        return annualInterestRate;
//    }
//
//    public void setAnnualInterestRate(double annualInterestRate) {
//        this.annualInterestRate = annualInterestRate;
//    }

    public Date getDateCreated() {
        return dateCreated;
    }

    
    public String toString(){
        return this.id + " " + this.balance + " " + this.dateCreated + "\n" + transactions; //+ this.annualInterestRate + " " 
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    public int countTransactions(char type){
        int count = 0;
        for(Transaction transaction:transactions)
            if(transaction.getType() == type)
                count++;
        
        return count;
    }
    
    
}
