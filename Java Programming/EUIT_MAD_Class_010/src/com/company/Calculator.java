package com.company;

public final class Calculator {
    public static final double pi_value = 3.1416;

    public int addition(int...values){ // This method contains two parameter.
//        System.out.println("Addition Value is: " + (number1 + number2));
        int sum = 0;
        for(int i=0; i<values.length; i++){
            sum += values[i];
        }
        return sum;
    }

    /*public int addition(int...values){ // This method contains two parameter.
//        System.out.println("Addition Value is: " + (number1 + number2));
        int sum = 0;
        for(int i=0; i<values.length; i++){
            sum += values[i];
        }
        return sum;
    }*/

    public int subtraction(int number1, int number2){ // This method contains two parameter.
//        System.out.println("Addition Value is: " + (number1 + number2));
        return (number1 - number2);
    }

}
