package com.company;

public class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Fleeting from branch to branch");
    }
}
