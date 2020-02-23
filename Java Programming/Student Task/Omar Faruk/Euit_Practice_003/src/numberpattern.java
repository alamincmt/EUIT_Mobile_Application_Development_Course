import java.util.Scanner;

public class numberpattern {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the row length:");
        int rowlength = scanner.nextInt();

        for (int i = 0; i <= rowlength; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
    }

}
