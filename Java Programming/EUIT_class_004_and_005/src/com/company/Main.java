package com.company;

public class Main {

    public static void main(String[] args) {
        // Loops in java
        // general loop
//        for(int i=1; i<=100; i++){
//
//            if(i==50){
//                return;
////                break;
////                continue;
//            }
//
//            System.out.println("" + i);
//
//        }

        // do while loop
//        int value = 0;
//        do {
//            value++;
//            System.out.println(" " + value);
//        }while (value < 100);

//        int i = 0, j = 0;
//        for (i = 0; i < 5; i++) {
//            for (j = i; j < 5; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println("");
//        }

        int[] arr = {23, 232, 434, 2324};
        String[] nameArr = {"Al-Amin", "Debabish", "Sultan", "Ripon", "Omar", "Shahanur", "Mahim", "Yousuf", "Munna"};
//        System.out.println("" + nameArr[5]);

//        for(int a=0; a<nameArr.length; a++){
//            if((nameArr[a]).equals("Yousuf")){
//                System.out.println("" + nameArr[a]);
//                break;
//            }
//        }

        // Enhanced loop
        for (String name : nameArr) {
            System.out.println(name);
        }

        int twoD[][] = new int[4][5];
        int i, j, k = 0;

        // Multidimensional array.
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

        for(i=0;i<4;i++){
            for (j = 0; j < 5; j++) {
                System.out.print("("+i + ","+j+") = " +twoD[i][j] + " ");
            }
            System.out.println();
        }
    }

}
