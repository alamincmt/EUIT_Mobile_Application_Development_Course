package com.company;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
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

        /*int arr1[] = new int[5];
        arr1[3]=10;
        // Insertion
        for(int i=0; i<arr1.length; i++){
            arr1[i] = scanner.nextInt();
        }

        printArray(arr1);

        System.out.println();

//        System.out.println("" + arr1.length);
        int[] arr = {208883, 232, 434, 2324};
        int n = arr.length;*/

        // Bubble Sort.
        /*for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] < arr[j+1]){
                    // swap temp  and arr[]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print("\t" + arr[i]);
        }*/

        String[] nameArr = {"Yousuf","Al-Amin", "Debabish", "Sultan", "Jui","Ripon", "Omar", "Shahanur", "Mahim", "Yousuf", "Munna"};
//        System.out.println("" + nameArr[3]);


        /*for(int a=0; a<nameArr.length; a++){
            if((nameArr[a]).equals("Yousuf")){
                nameArr[a] = "Zulekha";
//                System.out.println("" + nameArr[a]);
//                break;
            }
        }

        for(int a=0; a<nameArr.length; a++){
                System.out.println("" + nameArr[a]);
        }*/

        // Enhanced loop
        /*for (String name : nameArr) {
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
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }*/

        int[][] twoD = new int[4][5];
        int i, j, k = 0;

        // Multidimensional array.
        for (i = 0; i < 4; i++) {
            System.out.println("Input marks for student " + (i+1) );
            for (j = 0; j < 5; j++) {
                twoD[i][j] = scanner.nextInt();
//                k++;
            }
        }

        for(i=0;i<4;i++){
            for (j = 0; j < 5; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print("\t" + arr[i]);
        }
    }

}
