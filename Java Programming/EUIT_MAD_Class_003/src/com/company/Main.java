package com.company;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

	    // Basic data types
        byte b = 100; // this is byte data type it's range is : -128 to 127. memory size is: 8 bit
        System.out.println("Value is: " + b);

        short s = -32768; // this is short data type it's range is : -32768 to 32767. memory size is: 16 bit
        System.out.println("Value is: " + s);

        int i = -2147483648; // this is int data type it's range is : -2147483648 to 2147483647. memory size is: 32 bit
        System.out.println("Value is: " + i);

        long lng = -9223372036854775808l; // this is long data type it's range is : -9223372036854775808l; to 9223372036854775807l;. memory size is: 64 bit
        System.out.println("Value is: " + lng);

        // todo: cover all the data types with their description.

        char c = 'A';
        System.out.println("Value is: " + c);

        c = 'B';
        System.out.println("Value is: " + c++);
        System.out.println("Value is: " + c);

        boolean bl = true; // default value of boolean is false;
        System.out.println("Value is: " + bl);


        System.out.println("Rahim\"s ");

        int sum = 10 + 30;


        /*int modulusValue = scanner.nextInt();

        // code to find out even odd number.
        if(modulusValue % 2 == 0){
            System.out.println("Value is even " + modulusValue);
        }else{
            System.out.println("Value is odd " + modulusValue);
        }*/

        int num = 100;
        num *= 200;
        System.out.println("Value is= " + num);

        int a = 25;
        int co = ++a + 65;
        int d = (a--) + 20;

        int num1 = 10;
        int num2 = 20;
        System.out.println("Before Swap: " + num1 + ", " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1-num2;
        System.out.println("After Swap: " + num1 + ", " + num2);

        System.out.println("Num1 value: " + (num1 >> 10));

        System.out.println(d+" rrrrrrrrrrr");

        // Relational operators.
        System.out.println("Equal to: " + (10 == num2));
        System.out.println("Not Equal to: " + !(10 != num2));
        System.out.println("Greater then: " + (num1 > num2));
        System.out.println("Less then: " + (num1 < num2));
        System.out.println("Greater then or equal to: " + (num1 >= num2));
        System.out.println("Less then or equal to: " + (num1 <= num2));

//        expression1 ? expression2 : expression3

        /*if(num1==10){
            result = 2;
        }else{
            result = 5;
        }*/

        int result = num2 == 10 ? 2 : 5;
        System.out.println("Result Is: " + result);

        /*System.out.println("Enter age1: " );
        int var1 = scanner.nextInt();

        System.out.println("Enter age2: " );
        int var2 = scanner.nextInt();

        if(var1 > var2){
            if(var1 >= 18 && var1 <= 32){
                System.out.println("var 1 is adult.  ");
            }else if(var1 <= 17 && var1 >= 12){
                System.out.println("var 1 is young.  ");
            }else if(var1 >= 50){
                System.out.println("var 1 is old.  ");
            }
        }else{
            System.out.println("var 1 is small ");
        }*/


        System.out.println("Enter you task...");
        String name = scanner.nextLine();
        switch (name){
            case "Fan":
                System.out.println("Turn on Fan...");
                break;

            case "AC":
                System.out.println("Turn on AC...");
                break;

            case "Light":
                System.out.println("Turn on Light...");
                break;
            default:
                System.out.println("Do nothing...");
                break;

        }


    }

    public void testMethod(){
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
    }
}
