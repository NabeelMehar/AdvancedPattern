package Arrays;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int rowsArr1,colsArr1,rowsArr2,colsArr2;

        System.out.println("Enter The Rows and Cols of Matrix First :");

        rowsArr1=scanner.nextInt();
        colsArr1=scanner.nextInt();

        System.out.println("Enter The Rows and Cols of Matrix Second :");

        rowsArr2=scanner.nextInt();
        colsArr2=scanner.nextInt();

        if (colsArr1==rowsArr2) {
        int[][] arr1 =new int[rowsArr1][colsArr1];
        int[][] arr2 =new int[rowsArr2][colsArr2];

            int[][] arrResult = new int[rowsArr1][colsArr2];

            System.out.println("Enter Elements Of First Matrix:");

            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    arr1[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Enter Elements Of Second Matrix:");
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr2[i].length; j++) {
                    arr2[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Elements Of First Matrix are:");

            for (int[] ints : arr1) {
                for (int anInt : ints) {
                    System.out.print(anInt + " ");
                }
                System.out.println();
            }

            System.out.println("Elements Of Second Matrix are:");

            for (int[] ints : arr2) {
                for (int anInt : ints) {
                    System.out.print(anInt + " ");
                }
                System.out.println();
            }


            System.out.println("Multiplication Of  Matrix is :");
        for (int k = 0; k <rowsArr1 ; k++) {
            for (int j = 0; j < colsArr2; j++) {
                for (int i = 0; i < rowsArr2; i++) {
                    arrResult[k][j] += arr1[k][i] * arr2[i][j];
                }
                System.out.print(arrResult[k][j] + " ");
            }
            System.out.println();
        }




        }else {
            System.out.println("Not A Valid Matrix Size Cannot Multiply This Matrix");
        }
    }
}
















//    int rowsArr1=2,colsArr1=3,
//                rowsArr2=3,colsArr2=3;
//
//
//        int[][] arr1 =new int[rowsArr1][colsArr1];
//            int[][] arr2 =new int[rowsArr2][colsArr2];
//
//            int[][] arrResult = new int[rowsArr1][colsArr2];