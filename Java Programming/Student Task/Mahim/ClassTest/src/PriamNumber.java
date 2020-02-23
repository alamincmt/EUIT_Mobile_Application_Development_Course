import java.util.Scanner;

public class PriamNumber {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int Number ;
        System.out.println("Enter Number :");
        Number=input.nextInt();
        int count=0;

        for (int i=2;i<Number;i++){
            if(Number/i==0){
                count++;
                break;
            }
        }
        if (count==0){
            System.out.println("Priam Number");
        }
        else {
            System.out.println("Not Priam");
        }

    }
}
