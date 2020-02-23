import javax.crypto.spec.PSource;
import java.util.Scanner;

public class LeepYear {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int Year;
        System.out.print("Enter Year :");
        Year=input.nextInt();

        if (Year%400==0){
            System.out.println("Leap Year");
        }
        else if(Year%4==0 && Year%100!=0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Non Leap Year");
        }


    }
}
