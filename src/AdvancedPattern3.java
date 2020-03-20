import java.util.Scanner;

public class AdvancedPattern3 {
    public static void main(String[] args) {
        int flag=0;

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        for (int i = 0; i <=n; i++) {

                for (int j = 0; j < i; j++) {
                    if (i==n){
                        System.out.print("* ");
                    }else {
                        if (j == 0) {
                            System.out.print("* ");
                        } else if (j == i - 1) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                }
            System.out.println();

            }
        }

    }
