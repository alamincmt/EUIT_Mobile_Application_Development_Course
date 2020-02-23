import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a,b,c,d,e, result;


        System.out.print("Enter 5 Number :");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        d=input.nextInt();
        e=input.nextInt();

        result= (a>b)?((a>c?(a>d?(a>e?a:e):(d>e?d:e)):(c>d?(c>e?c:e):(d>e?d:e)))):
                (b>c?(b>d?(b>e?b:e):(d>e?d:e)):(c>d?(c>e?c:e):(d>e?d:e)));
        System.out.println("Larger Number :"+result);



    }
}
