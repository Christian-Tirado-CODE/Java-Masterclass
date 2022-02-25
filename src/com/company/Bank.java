package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private String name;
    ArrayList<Branch> branches = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public String addBranch(String branchName, String customerName, double amount){
        if(findBranchIndex(branchName) >= 0){
            return "Branch Already exists.";
        }

        Branch newBranch = new Branch(branchName);
        newBranch.addCustomer(customerName, amount);
        branches.add(newBranch);
        return "New branch added!";
    }

     public String addTransaction(String customerName,double amount){
        for(int i=0; i < branches.size(); i++){
            for (int j=0; j < branches.get(i).customers.size(); j++){
                if(branches.get(i).customers.get(j).getName().equals(customerName)){
                    branches.get(i).customers.get(j).addTransaction(Double.valueOf(amount));
                    return "Transaction was successful";
                }
            }
        }
        return "Customer was not Found";
     }

     public void showBranchCustomers(){
         Scanner scanner = new Scanner(System.in);
         boolean includeTransactions = false;
         String input;
         System.out.println("Do you wish to see the customers transactions?(Y/N)");
          input = scanner.next();

          for (int i=0; i < branches.size(); i++){
              System.out.println("Customers from branch " + branches.get(i).getName() + ":" + "\n");
              for(int j=0; j < branches.get(i).customers.size(); j++){
                  System.out.println(branches.get(i).customers.get(j).getName() + "\n");
                  if(input.equals("Y")){
                      System.out.println("Here is a list of his transactions: ");
                      for(int k=0; k < branches.get(i).customers.get(j).transactions.size(); k++){
                          System.out.println(branches.get(i).customers.get(j).transactions.get(k).doubleValue());
                      }
                  }
              }
          }


         scanner.close();
     }



    private int findBranchIndex(String name){
        int branchIndex = -1;
        for(int i=0; i < branches.size(); i++){
            if(branches.get(i).getName().equals(name)){
                branchIndex = i;
            }
        }
        return branchIndex;
    }
}
