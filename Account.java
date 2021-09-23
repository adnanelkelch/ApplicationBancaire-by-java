package com.company;

public class Account {
    String accountNumber;
    boolean accountState = true;
    double balance = 0;
    public static long number = 1;

    public Account(double balance) {
        this.accountNumber = "" + number++;
        this.balance = balance;
    }

    public void deposit(double bal){
        if(accountState == true) {
            this.balance = this.balance + bal;
        }else{
            System.out.println("account deactivated!");
        }
    }

    public void withdraw(double bal){
        this.balance = this.balance - bal;
    }

    public void deactivate(){
        accountState = false;
    }

    public void activate() { accountState = true; }
}
