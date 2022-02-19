package com.company;

public class House {
    private int size;
    private Bedroom bedroom;

    public House(int size, Bedroom bedroom){
        this.size = size;
        this.bedroom = bedroom;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }


}
