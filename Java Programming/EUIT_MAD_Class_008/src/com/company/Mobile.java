package com.company;

public class Mobile {

    static String name, brand;
    static double price;

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





}
