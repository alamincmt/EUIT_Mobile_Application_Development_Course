package com.company;


import java.util.Scanner;

public class Class_TestDemo {
    public static void main(String[]args) {
     Scanner input=new Scanner(System.in);
     int year;
        System.out.print("Enter any year:");
        year=input.nextInt();
       if(year%400==0)
            System.out.println("Leap year:");
        else if(year%4==0 && year%100!=0)
            System.out.println("leap year");
        else{
           System.out.println("Leap year:");
       }
    /*    System.out.print("Enter any positive number: ");
        int count = 0;
        int num = input.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % 2 == 0) {
                count++;
                break;
            }
        }
         if(count==0){
             System.out.println("Prime number:");
        }else {
             System.out.println("Not prime number:");
         }*/
       /* int mark;
        System.out.print("Enter any mark:");
        mark=input.nextInt();
        if(mark>=100 || mark<=0)
        System.out.println("Invalid number:");

        if(mark>=80 && mark<=100)
            System.out.println("Result is = A+");
        else if(mark>=70 && mark<=79)
            System.out.println("Result is = A");
        else if(mark>=60 && mark<=69)
            System.out.println("Result is = A-");
        else if(mark>=50 && mark<=59)
            System.out.println("Result is = B");
        else if(mark>=40 && mark<=49)
            System.out.println("Result is = C");
        else if(mark>=33 && mark<=39)
            System.out.println("Result is = D");

        else{
            System.out.println("Fail");
        }
*/

   /*     int a;
        int b;
        int c;
        int d;
        int e;
        System.out.print("Enter 5 number:");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        d=input.nextInt();
        e=input.nextInt();
        if(a>b && a>c){
            System.out.println("The larger number="+a);
        }else if(b>a && b>c){
            System.out.println("The larger number="+b);
        }else if(c>a && c>b){
            System.out.println("The larger number="+c);
        }else  if(d>a && d>b){
            System.out.println("The larger number="+d);
        }else if(e>a && e>d){
            System.out.println("The larger number="+e);
        }else{
            System.out.println("Equal");
        }*/

    }
}
