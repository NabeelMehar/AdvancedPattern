import java.util.Scanner;

public class sumOfDigits
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int result=0;

        while (n!=0){
        int temp=n%10;
        result+=temp;
        n=n/10;
        }

        System.out.println(result);

//        int size=Math.log10(n)+1;

    }
}
