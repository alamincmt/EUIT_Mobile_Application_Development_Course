import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        short score1;
        short score2;
        short score3;
           int avg=0;
        for(int i=0;i<=3;i++){
            System.out.println("enter any score1 :");
            score1=input.nextShort();
            System.out.println("enter any score2 :");
            score2=input.nextShort();
            System.out.println("enter any score3 :");
            score3=input.nextShort();

            avg=(score1+score2+score3)/3;
            System.out.println(avg+"%");
        }

    }
}
