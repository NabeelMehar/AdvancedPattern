import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        float result=0;

        for (float i = 1; i <=n ; i++) {

            if (i%2==1){
                result+=1/i;
            }else {
                result-=1/i;
            }
        }

        System.out.println(result);

    }
}
