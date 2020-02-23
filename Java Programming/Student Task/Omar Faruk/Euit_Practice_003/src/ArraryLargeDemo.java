public class ArraryLargeDemo {
    public static void main(String[]args) {

        int series[] = {55, 21, 68165, 9879, 5644, 20003, 214654, 543665, 44745, 12, 58};

        int large = series[0];

        for (int i = 1; i < series.length; i++) {
            if (series[i] > large) {
                large = series[i];
            }

        }

        System.out.println("largest number is " + large);

    }
}
