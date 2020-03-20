package Arrays;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int[][] arr1 =new int[3][5];
        int[][] arr2 =new int[3][5];

        System.out.println("Enter Elements Of First Array:");

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Enter Elements Of Second Array:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j]=scanner.nextInt();
            }
            System.out.println();
        }

        System.out.println(" Elements Of First Array are:");

        for (int[] ints : arr1) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println("Elements Of Second Array are:");
        for (int[] ints : arr2) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println("Addition of Arrays is:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print((arr1[i][j]+arr1[i][j])+" ");
            }
            System.out.println();
        }


    }
}
