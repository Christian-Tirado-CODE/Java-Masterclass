package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*
         Create a simple banking application
         There should be a Bank class
         It should have an arraylist of Branches
         Each Branch should have an arraylist of Customers
         The Customer class should have an arraylist of Doubles(transactions).
         Customer:
         Name, and the ArrayList of doubles.
         Branch:
         Need to be able to add a new customer and initial transaction amount.
         Also needs to add additional transactions for that customer/branch
         Bank:
         Add a new branch
         Add a customer to that branch with initial transaction.
         Add a transaction for an existing customer for that branch.
         Show a list of customers for a particular branch and optionally a list of their transactions.
         Add autoboxing and unboxing to the transactions.
         Add data validation

         */

        Bank bank = new Bank("First Bank");

        bank.addBranch("Orange County", "John Smith", 1000.0);
        bank.addBranch("Old Town", "Ima Sample", 1000.0);
        bank.addTransaction("John Smith", 3000.05);
        bank.showBranchCustomers();
    }
}
