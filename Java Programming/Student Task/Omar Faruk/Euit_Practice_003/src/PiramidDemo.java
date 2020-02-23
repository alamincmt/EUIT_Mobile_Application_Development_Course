import java.util.Scanner;

public class PiramidDemo {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the row number :");
        int num2 = scanner.nextInt();

        for (int i = 1; i <= num2; i++) {
            System.out.print(" ");
            for (int j = num2; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
