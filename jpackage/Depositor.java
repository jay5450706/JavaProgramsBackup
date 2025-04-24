package jpackage;

public class Depositor implements Runnable{
    BankAccount account;

    Depositor(BankAccount account){
        this.account = account;
    }

    @Override
    public void run() {
        account.deposit(500);
    }
}
