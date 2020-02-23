import java.util.Scanner;

public class ReverseDemo {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the  row number:");
        int num1 = scanner.nextInt();
        for (int i = num1; i >= 0; i--) {
            System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
