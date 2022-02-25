package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
     ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTransaction(double amount){

        transactions.add(Double.valueOf(amount)); // Autoboxing
    }
}
