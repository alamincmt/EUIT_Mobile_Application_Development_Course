package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input=new Scanner (System.in);
        int num1,num2,result;
        System.out.println("enter first number:");
        num1 =input.nextInt();
        System.out.println("enter secoud number:");
        num2=input.nextInt();
        result=num1+num2;
        System.out.println("sum:"+result);
        result=num1-num2;
        System.out.println("sub:"+result);
        result=num1*num2;
        System.out.println("mul:"+result);
        result=num1/num2;
        System.out.println("div:"+result);




    }
}
