import java.util.Scanner;

public class LeapYear00 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int year ;
        System.out.print("Enter the year:");
        year = input.nextInt();

        if((year%400==0)||(year%4==0 && year%100!=0)){
            System.out.println("Leap year");
        }else{
            System.out.println("Not Leap Year");
        }
    }
}
