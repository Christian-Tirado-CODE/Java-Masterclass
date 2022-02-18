package com.company;

public class Wall {
    private double width;
    private double height;

    public Wall(){
        this(2.0, 4.0);
    }

    public Wall(double width, double height) {
        this.width = width > 0 ? width : 0;
        this.height = height > 0 ? height : 0;
    }

    public double getWidth() {
        return this.width;
    }


    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        this.width = width > 0 ? width : 0;
    }

    public void setHeight(double height) {
        this.height = height > 0 ? height : 0;
    }

    public double getArea(){
        return this.width * this.height;
    }
}
