import java.util.Scanner;

public class AdvancedPattern1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count=1;

        int size = 0;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i <= (2 * ((n - size) - 1)); i++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= size; i++) {
                System.out.print(count+"   ");
                count++;
            }
            System.out.println();
            size++;
        }

    }
}
