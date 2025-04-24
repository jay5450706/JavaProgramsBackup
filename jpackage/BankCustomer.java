package jpackage;

public class BankCustomer {
    public static void main(String[] args) {
        BankAccount john = new BankAccount();
        BankAccount agnes = new BankAccount();

        Depositor depositor = new Depositor(john);
        Withdrawer withdrawer = new Withdrawer(agnes);//doesn't update balance corretly even though methods are synchronized.
        //not even synchronized(this) will work

        //Withdrawer withdrawer = new Withdrawer(john);

        Thread depositThread = new Thread(depositor, "depositer");
        Thread withdrawerThread = new Thread(withdrawer, "withdrawer");

        depositThread.start();
        withdrawerThread.start();

        try {
            depositThread.join();
            withdrawerThread.join();

            System.out.println("Balance is: " + BankAccount.balance);

        } catch (InterruptedException e) {
            System.out.println("IE caught");
        }

    }
}
