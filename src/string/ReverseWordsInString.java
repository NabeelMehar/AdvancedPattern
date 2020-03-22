package string;

import java.util.Scanner;

public class ReverseWordsInString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int falg=0;
        int SPACEFLAG=0;
        String result="";

        String s1=scanner.nextLine();

        if (s1.length()>0) {

            for (int i = s1.length() - 1; i >= 0; i--) {
                SPACEFLAG = 0;
                if (s1.charAt(i) == ' ' || i == 0) {
                    for (int j = i + 1; j < s1.length(); j++) {

                        if (i == 0 && falg == 0) {
                            result += s1.charAt(i);
                            falg = 1;
                        }
                        if (s1.charAt(j) == ' ') {
                            if (s1.charAt(j - 1) == ' ')
                                SPACEFLAG = 1;
                            break;
                        } else {
                            result += s1.charAt(j);
                        }
                    }
                    if (SPACEFLAG == 0 && falg == 0) {
                        result += " ";
                    }
                }
            }


            if (result.charAt(0) == ' ' && result.charAt(1) == ' ') {
                result = result.substring(2);
            }

            if (result.charAt(0) == ' ') {
                result = result.substring(1);
            }

            if (result.charAt(result.length() - 1) == ' ') {
                result = result.substring(1, result.length() - 2);
            }


            System.out.println(result);
        }
        else {
            System.out.println("Wrong Input");
        }
    }
}
