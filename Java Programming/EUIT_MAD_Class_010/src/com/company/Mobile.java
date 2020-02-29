package com.company;

public class Mobile {

    private String name, brand;
    private double price;

    // this constructor for singleton design pattern.
    /*private Mobile() {
    }*/

    public Mobile() {
    }

    public Mobile(String name, String brand, double price){
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
