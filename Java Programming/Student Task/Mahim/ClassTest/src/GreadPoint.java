import java.util.Scanner;

public class GreadPoint {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int Mark;
        System.out.print(" Enter Mark:");
        Mark=input.nextInt();

        if (Mark>=80 && Mark <=100  ){
            System.out.println("Result A+");
        }
        else if (Mark>=70 && Mark<=79 ){
            System.out.println("Result A");
        }
        else if (Mark>=60 && Mark<=69  ){
            System.out.println("Result A-");
        }
        else if (Mark>=50 && Mark<=59  ){
            System.out.println("Result B");
        }
        else if (Mark>=40 && Mark<=49 ){
            System.out.println("Result C");
        }
        else if (Mark>=33 && Mark<=39  ){
            System.out.println("Result D");
        }
        else if (Mark>=0 && Mark<=32  ){
            System.out.println("Result F");
        }
        else {
            System.out.println("Out Off Mark");
        }


    }
}
