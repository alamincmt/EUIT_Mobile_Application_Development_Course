package com.company;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    // write your code here
        System.out.println("OOP... ");

//        Calculator calculator = new Calculator();
//        System.out.println("Input number 1 ");
//        int number1 = scanner.nextInt();

//        System.out.println("Input number 2 ");
//        int number2 = scanner.nextInt();

        /*int[] values = {200, 300, 100, 234324, 2343, 3434, 3434, 999};
        int res = calculator.addition(values); // passing two arguments here.
        System.out.println("Result: " + res);

        print1To100(0);*/

        Mobile mobile = new Mobile("iPhone", "Apple", 120000);
        System.out.println("Mobile Object Information: Name = " + mobile.name + " Brand = " + mobile.brand + " Price = " + mobile.price);


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
