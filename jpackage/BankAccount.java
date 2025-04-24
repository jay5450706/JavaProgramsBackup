package jpackage;
/*
 * Let us say that this class represents a,
 * bank account for a lending company
 */

public class BankAccount {
    private static Object lock = new Object();
    static double balance = 200;


   //synchronized void deposit(double amount){
  void deposit(double amount){
        synchronized(lock){

            System.out.println("Depositing...");
            double tempBal = balance;
            tempBal = tempBal + amount;

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted");
            }

            System.out.println("Updating Balance After Deposit...");
            balance = tempBal;
        }
    }

  //synchronized  void withdraw(double amount){
   void withdraw(double amount){
        synchronized(lock){

            System.out.println("Widthrawing...");
            double tempBal = balance;
            tempBal = tempBal - amount;
    
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted");
            }
    
            System.out.println("Updating Balance After Withdrawal...");
            balance = tempBal;
        }
    }
}
