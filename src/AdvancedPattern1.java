import java.util.Scanner;

public class AdvancedPattern1 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int size=0;

        while (size!=n) {
            for (int i = 1; i <=(2*((n-size)-1)); i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <=size; i++) {
                System.out.print("*  ");
            }
            System.out.println();
            size++;
        }

    }
}
