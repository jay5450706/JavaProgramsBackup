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
public class SavingAccount extends Account {
    
    private double annualInterestRate;

    public SavingAccount(double annualInterestRate, int id, double balance, Client client) {
        super(id, balance, client);
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    @Override
    public String toString() {
        return super.toString() + "SavingAccount{" + "annualInterestRate=" + annualInterestRate + '}';
    }
    
    
    
}
