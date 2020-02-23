import java.util.Scanner;

public class GreadingPoint {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int mark;
        System.out.print("Enter the mark:");
        mark = input.nextInt();

        if(mark>=80){
            System.out.println("The great is:A+");
        }else if(mark>=80){
            System.out.println("The great is:A");
        }else if(mark>=70){
            System.out.println("The great is:A-");
        }else if(mark>=60){
            System.out.println("The great is:B+");
        }else if(mark>=50){
            System.out.println("The great is:B-");
        }else if(mark>=40){
            System.out.println("The great is:c");
        }else if(mark>=33){
            System.out.println("The great is:C-");
        }else
            System.out.println("The great is:fail");
        }
    }

