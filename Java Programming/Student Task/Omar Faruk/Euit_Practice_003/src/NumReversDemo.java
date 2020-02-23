import java.util.Scanner;

public class NumReversDemo {
    public static void numberpattern2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the row length...");
        int rowlength = scanner.nextInt();

        int k = 11;
        for (int i = 0; i <= rowlength; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print(k + " ");
            }
            System.out.println();

        }

        System.out.println();
        System.out.println();
    }
}
