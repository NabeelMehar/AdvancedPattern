import java.util.Scanner;

public class AdvancedPattern2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int flag=0;
        int n=scanner.nextInt();
        int tempsize=n-1;

        for (int i = 0; i <= ((2*n)-1)+1;i++) {
            if (flag==1){
                for (int j = 0; j <tempsize ; j++) {
                    System.out.print("* ");
                }
                tempsize--;
                System.out.println();
            }
            else {
                if (i != 0 && n / i == 0) {
                    flag = 1;
                } else {
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
