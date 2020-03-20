package Arrays;

import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int marks[]=new int[5];
        int total=0;
        int  avg=0;

        System.out.println("Enter Marks Of A Student");
        for (int i = 0; i < marks.length; i++) {
            marks[i]=scanner.nextInt();
        }

        for (int i = 0; i < marks.length; i++) {
            total+=marks[i];
        }

        avg=total/marks.length;

        System.out.println(avg);


    }
}
