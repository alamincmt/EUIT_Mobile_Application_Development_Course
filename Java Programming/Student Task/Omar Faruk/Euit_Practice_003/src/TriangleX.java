
import java.util.Scanner;


public class TriangleX {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter the row number:");
        int num = input.nextInt();

        for(int i = num; i>=0;i--){
            System.out.print("");
            for(int j =0;j<=i;j++){
             System.out.print(" * ");
            }
            System.out.println();
        }
    }
}



