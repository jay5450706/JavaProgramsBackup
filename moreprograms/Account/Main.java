/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

//import java.util.ArrayList;

import java.util.Arrays;


/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args){
        Client client = new Client(100, "James","0706222545");
        
        Account[] accounts = new Account[2];
        accounts[0] = new SavingAccount(4.5,1,1000,client);
        accounts[0].withdraw(500);
        accounts[0].deposit(200);
        
        accounts[1] = new CurrentAccount(-200,2,2000,client);
        accounts[1].withdraw(2000);
        accounts[1].withdraw(200);
        accounts[1].withdraw(100);
        accounts[1].deposit(300);
        
        System.out.println(Arrays.toString(accounts));
        

//        
//        ArrayList<Account> accounts = new ArrayList<>();
//        
//        Client client = new Client(100,"Jimmy","706222545");
//        accounts.add(new Account(1,1000,1.5,client));
//        accounts.add(new Account(2,2000,2.5,client));
//        
//        accounts.get(0).withdraw(2000);
//        accounts.get(0).withdraw(1000);
//        System.out.println(accounts.get(0).getBalance());
//        accounts.get(0).deposit(2000);
//        accounts.get(0).withdraw(1000);
//        
//        accounts.get(1).deposit(100);
//        accounts.get(1).deposit(300);
//        
//        System.out.println(accounts.get(0));
//        
//        for(Account account:accounts){
//            System.out.println("Account " + account.getId() + ":");
//            System.out.println("W:" + account.countTransactions('W'));
//            System.out.println("D:" + account.countTransactions('D'));
//        }
        
//        Client[] clients = new Client[2];
//        
//        clients[0] = new Client(100,"Jimmy","706222545");
//        clients[1] = new Client(200,"James","792175787");
//        
//        clients[0].addAccount(new Account(1,1000,1.5));
//        clients[0].addAccount(new Account(2,2000,2.5));
//        
//        clients[1].addAccount(new Account(3,3000,3.5));
//        clients[1].addAccount(new Account(4,4000,4.5));
//        clients[1].addAccount(new Account(5,5000,5.5));
//        
//        System.out.println(clients[0].toString());
//        System.out.println(clients[1].toString());
        
        
//            Account testAccount = new Account(1122,20_000,4.5);
//            
//            if(testAccount.withdraw(2500)){
//                System.out.println("Withdraw Successful");
//            }
//            else
//                System.out.println("Withdraw not successful");
//            
//            testAccount.deposit(3000);
//            
//            System.out.println("Account Information: " + 
//                    "Id " + testAccount.getId() + 
//                    "Balance " + testAccount.getBalance() + 
//                    "Annual Interest Rate " + testAccount.getAnnualInterestRate() + 
//                    "Date Created " + testAccount.getDateCreated().toString());
    }
    
}
