package com.company;

import com.company.math.Addition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    private static List<Mobile> mobileList = new ArrayList<>();

    public static void main(String[] args) {
	    // write your code here
        System.out.println("OOP... ");


        Mobile mobile = new Mobile("iPhone", "Apple", 120000);
        mobileList.add(mobile);

        mobile = new Mobile("Samsung S10", "Samsung", 120000);
        mobileList.add(mobile);

        mobile = null;

        System.gc();

        System.out.println("Data Size: " + mobileList.size());

        for(int i=0; i<mobileList.size(); i++){
            System.out.println("Values in : " + i +" = "+ mobileList.get(i).getName() + "\t" + mobileList.get(i).getBrand() + "\t" + mobileList.get(i).getPrice());
        }



    }

    // This is recursive method.
    private static void print1To100(int i){
        System.out.println("" + ++i);
        if(i < 100){
            print1To100(i);
        }
    }

    // This is recursive method.
    private static void print1To100(int i, int j){
        System.out.println("" + ++i + " = " + ++j);
        if(i < 100){
            print1To100(i, j);
        }
    }
}
