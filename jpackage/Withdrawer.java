package jpackage;

public class Withdrawer implements Runnable{
    BankAccount account;

    Withdrawer(BankAccount account){
        this.account = account;
    }

    @Override
    public void run() {
        account.withdraw(100);
    }
}
