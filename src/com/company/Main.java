package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Account timsAccount = new Account("Tim");
    timsAccount.deposit(1000);
    timsAccount.withdraw(500);
    timsAccount.withdraw(-20);
    timsAccount.deposit(-20);
    timsAccount.calculateBalance();
    //timsAccount.balance = 5000; Error

    System.out.println("Balance on account is " + timsAccount.getBalance());
    //timsAccount.transactions.add(4500); Error
    timsAccount.calculateBalance();
    }

    /*
      Static methods and fields belong to the class not to the instance of the class.
      As a consequence:
        - static field values are shared across all instances.
        - static methods can be accessed using the class. Examples: Integer.parseInt(), Double.toDoubleValue().
     */
}
