/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author user
 */
public class CurrentAccount extends Account{
    private double limitBelowZero;

    public CurrentAccount(double limitBelowZero, int id, double balance, Client client) {
        super(id, balance, client);
        this.limitBelowZero = limitBelowZero;
    }

    @Override
    public boolean withdraw(double amount) {
        if(super.getBalance() - amount < this.limitBelowZero) return false;
        
        super.setBalance(super.getBalance() - amount);
        super.transactions.add(new Transaction('W',amount, super.getBalance(),"Withdrawn " + amount));
        
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "CurrentAccount{" + "limitBelowZero=" + limitBelowZero + '}';
    }
    
    
    
    
}
