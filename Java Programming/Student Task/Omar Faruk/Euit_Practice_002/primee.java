import java.util.Scanner;

public class primee {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num, count=0;
        System.out.print("enter the number:");
        num = input.nextInt();


        for(int i = 2;i<num;i++){
            if (num % i == 0) {
                count++;
                break;
            }
            }
        if(count==0){
            System.out.println("prime number");
        }else {
            System.out.println("not prime number");
        }
        }
    }

