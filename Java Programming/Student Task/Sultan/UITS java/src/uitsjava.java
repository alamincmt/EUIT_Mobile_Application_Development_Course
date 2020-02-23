import java.util.Scanner;

public class uitsjava {



    public  static  void main (String[]args){


//         largest();
        grading();
//        smalest();
//
//       PrimeNonPrime();



    }

    private static void PrimeNonPrime() {

        Scanner primscan = new Scanner(System.in);
        System.out.println("Enter Your Number foe Just Prime Or Not Prime");
        boolean Prime = true;
        int num = primscan.nextInt();
        for (int m =2 ; m< num;m++){
            if (num%m==0){
                Prime = false;
            }

        }if (Prime==true){
            System.out.println("The Number are Prime");
        }else {
            System.out.println("The Number ar not Prime Number ");
        }
    }

    private static void smalest() {

        Scanner scansmall = new Scanner(System.in);
        System.out.println("Enter Your all Number S ");

        Long small  = scansmall.nextLong();
        while (scansmall.hasNextLong()){
            Long number = scansmall.nextLong();
            if (number < small){
                small =number;

            }
        }System.out.println(small);
    }

    private static void largest() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your all Number B");

        Long largest  = scan.nextLong();
        while (scan.hasNextLong()){
            Long number = scan.nextLong();
            if (number > largest){
                largest =number;

            }
        }System.out.println(largest);
    }

    private static void grading() {

        Scanner mark = new Scanner(System.in);

        System.out.println("Enter Your Mark ");

        Float Mrk= mark.nextFloat();

        if (Mrk >= 80 && Mrk<=100){
            System.out.println("You gote A+");
        }else if (Mrk >=70 && Mrk<=80){
            System.out.println("You Gote A");
        }else if (Mrk>=60&& Mrk<=70){
            System.out.println("You gote A-");
        }else if (Mrk >=50 && Mrk<=60){
            System.out.println("You gote C");
        }else if (Mrk >=40 && Mrk<=50){
            System.out.println("You gote D");
        }else if (Mrk >= 33 && Mrk<=40){
            System.out.println("You gote Pass");
        }else if (Mrk <=32){
            System.out.println("You gote Fail ");
        }else{
            System.out.println("Invalid input.");
        }

    }






}
