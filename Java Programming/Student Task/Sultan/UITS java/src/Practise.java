import java.util.Scanner;

public class Practise {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

/*        System.out.println("Enter value1....");
        int value1=scanner.nextInt();

        System.out.println("Enter value2....");
        int value2=scanner.nextInt();

        System.out.println("Enter value3....");
        int value3=scanner.nextInt();

        System.out.println("Enter value4....");
        int value4=scanner.nextInt();

        System.out.println("Enter value5....");
        int value5=scanner.nextInt();

        if (value1>value2 && value1>value3 && value1>value4 && value1>value5 ){
            System.out.println("Largest number is "+value1);
        }else if (value2>value1 && value2>value3 && value2>value4 && value2>value5){
            System.out.println("Largest number is "+value2);
        }else if (value3>value1 && value3>value2 && value3>value4 && value3>value5){
            System.out.println("Largest number is "+value3);
        }else if (value4>value1 && value4>value2 && value4>value3 && value4>value5){
            System.out.println("Largest number is "+value4);
        }else {
            System.out.println("Largest number is "+value5);
        }*/







        System.out.println("Enter val1....");
        int val1=scanner.nextInt();

        System.out.println("Enter val2....");
        int val2=scanner.nextInt();

        System.out.println("Enter val3....");
        int val3=scanner.nextInt();

        System.out.println("Enter val4....");
        int val4=scanner.nextInt();

        System.out.println("Enter val5....");
        int val5=scanner.nextInt();

        if (val1<val2 && val1<val3 && val1<val4 && val1<val5 ){
            System.out.println("Lowest number is "+val1);
        }else if (val2<val1 && val2<val3 && val2<val4 && val2<val5){
            System.out.println("Lowest number is "+val2);
        }else if (val3<val1 && val3<val2 && val3<val4 && val3<val5){
            System.out.println("Lowest number is "+val3);
        }else if (val4<val1 && val4<val2 && val4<val3 && val4<val5){
            System.out.println("Lowest number is "+val4);
        }else {
            System.out.println("Lowest number is "+val5);
        }



/*        int year=scanner.nextInt();

        if (year%4==0){
            System.out.println(year+" is a leap year.... ");
        }else {
            System.out.println(year+" is not a leap year.... ");
        }*/

/*

        System.out.println("Enter a number....");
        int number=scanner.nextInt();
        int count=0;
        if (number==0 || number==1){
            System.out.println(number+" Is not a prime number");
        }else {
            for (int i=2;i<number;i++){
                if (number%i==0){
                    count++;
                    break;
                }
            }

            if (count==0){
                System.out.println(number+" Is a prime number");
            }else {
                System.out.println(number+" Is not a prime number");
            }
        }
*/

/*

        System.out.println("Enter your mark......");
        int mark=scanner.nextInt();

        if (mark<33){
            System.out.println("You are faii.....");
        }else if (mark>=33 && mark<=39){
            System.out.println("Your letter grade is D");
        }else if (mark>=40 && mark<=49){
            System.out.println("Your letter grade is C");
        }else if (mark>=50 && mark<=59){
            System.out.println("Your letter grade is B");
        }else if (mark>=60 && mark<=69){
            System.out.println("Your letter grade is A-");
        }else if (mark>=70 && mark<=79){
            System.out.println("Your letter grade is A");
        }else{
            System.out.println("Your letter grade is A+");
        }
*/



    }
}
