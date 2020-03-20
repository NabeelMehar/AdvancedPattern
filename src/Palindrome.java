import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int temp=n;
        int result=0;


        while (temp!=0){

            int remainder=temp%10;
            result*=10;
            result+=remainder;
            temp/=10;
        }
    if (result==n){
        System.out.println("This Number is Palindrome");
    }else {
        System.out.println("No this Number is Not Palindrome");
    }

    }
}
