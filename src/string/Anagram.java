package string;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String s1=scanner.nextLine();
        String s2=scanner.nextLine();

        boolean isAnagram=true;

        int []al=new int[256];

        for (char c : s1.toCharArray()) {
            int index= c;
            al[index]++;
        }

        for (char c : s2.toCharArray()) {
            int index= c;
            al[index]--;
        }

        for (int i = 0; i < 256; i++) {

            if (al[i]!=0) {
                isAnagram = false;
                break;
            }

        }

        if (isAnagram){
            System.out.println("Is Anagram");
        }else {
            System.out.println("Is Not Anagram");
        }

    }
}
