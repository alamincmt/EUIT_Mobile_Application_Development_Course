import java.util.Scanner;

public class SmallNUM {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first num:");
        int num = input.nextInt();

        System.out.print("Enter the 2nd num:");
        int num1 = input.nextInt();

        System.out.print("Enter the 3rd num:");
        int num2 = input.nextInt();

        System.out.print("Enter the 4th num:");
        int num3 = input.nextInt();

        System.out.print("Enter the 5th num:");
        int num4 = input.nextInt();

        if(num<num1 && num<num2 && num<num3 && num<num4){
            System.out.println("num1 is small");

        }else if(num1<num && num1<num2 && num1<num3 && num1<num4){
            System.out.println("num2 is small");

        }else if(num2<num && num2<num1 && num2<num3 && num2<num4){
            System.out.println("num3 is small");

        }else if(num3<num && num3<num2 && num3<num1 && num3<num4){
            System.out.println("num4 is small");
        }else{
            System.out.println("num5 is small");
        }
    }
}


