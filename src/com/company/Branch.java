package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String addCustomer(String name, double amount){

        if(findCustomerIndex(name) >= 0){
             return "Customer Already exists.";
         }

         Customer newCustomer = new Customer(name);
         newCustomer.addTransaction(amount);
         customers.add(newCustomer);
         return "New customer added!";
    }

    public String addCustomerTransaction(String name, double amount){
        int customerIndex = findCustomerIndex(name);

        if(customerIndex <= 0){
           return "Customer not found.";
        }

        customers.get(customerIndex).addTransaction(amount);
        return "Transaction was successful";
    }

    public int findCustomerIndex(String name){
        int customerIndex = -1;
        for(int i=0; i < customers.size(); i++){
            if(customers.get(i).getName().equals(name)){
                customerIndex = i;
            }
        }
        return customerIndex;
    }
}
