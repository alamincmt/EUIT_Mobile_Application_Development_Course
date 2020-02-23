import java.util.Scanner;

public class NumberPiramidDemo {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter  length num: ");
        int rowlength = input.nextInt();

        int k = 0;
        for (int i = 0; i <= rowlength; i++) {
            for (int j = 0; j <= i; j++) {
                k++;
                System.out.print(k + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
    }

}
