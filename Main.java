package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Client c1 = new Client("EE123123","Ahmed","Ali");
       Account acc1 = new Account(100);
       c1.account = acc1;

        System.out.println(c1.name+ " " + c1.surname);
        System.out.println(c1.account.accountNumber);
        System.out.println(c1.account.balance);

        c1.account.deactivate();
        c1.account.deposit(200);


    }
}
