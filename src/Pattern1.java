import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= n; i++) {

                if (n-j>=i){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
