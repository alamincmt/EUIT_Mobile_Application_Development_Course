import java.util.Arrays;
import java.util.Scanner;

public class homework2 {

    static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {

//        triangle();
//        reverseTriangle();

//        numberpattern1();
//        numberpattern2();
//        numberpattern3();
//        numberpattern4();
//        pyramid();
            largest();


        }

        public static void triangle() {
            //Triangle
            System.out.println("Enter the range of triangle row....");

            int num = scanner.nextInt();
            for (int i = 0; i <= num; i++) {
                System.out.print(" ");
                for (int j = 0; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }

        public static void reverseTriangle() {

            System.out.println("Enter the range of triangle row....");
            int num1 = scanner.nextInt();
            for (int i = num1; i >= 0; i--) {
                System.out.print(" ");
                for (int j = 0; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }

        public static void pyramid() {

            System.out.println("Enter the range of pyramid row....");
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


        public static void numberpattern1() {

            System.out.println("Enter the row length...");
            int rowlength = scanner.nextInt();

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

        public static void numberpattern2() {

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

        public static void numberpattern3() {

            System.out.println("Enter the row length...");
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

        public static void numberpattern4() {

            System.out.println("Enter the row length...");
            int rowlength = scanner.nextInt();

            for (int i = 0; i <= rowlength; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }

            System.out.println();
            System.out.println();
        }

        public static void largest() {

            int series[] = {55, 21, 68165, 9879, 5644, 20003, 214654, 543665, 44745, 12, 58};

            int large = series[0];

            for (int i = 1; i < series.length; i++) {
                if (series[i] > large) {
                    large = series[i];
                }

            }

            System.out.println("largest number is " + large);


            int series1[] = {54544, 46523, 5468756, 3146, 316464, 4556, 54, 26644556, 3461146, 3161314, 3464, 164134, 63466543};
            int largest = Arrays.stream(series1).max().getAsInt();
            System.out.println("Largest number is " + largest);

        }
}
