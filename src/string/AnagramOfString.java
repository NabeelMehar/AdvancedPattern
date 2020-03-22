package string;

import java.util.Scanner;

public class AnagramOfString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
//        boolean isAnagram=false;
//        int count=0;
//
//        if (s1.length()==s2.length()){
//
//            for (int j = 0; j < s1.length(); j++) {
//                isAnagram=false;
//                for (int i = 0; i < s2.length(); i++) {
//
//                    if (j>0 && s1.charAt(j-1)==s1.charAt(j)){
//                        if (s1.charAt(j)==s2.charAt(i)){
//                            count++;
//                            if (count==2){
//                                isAnagram=true;
//                                break;
//                            }
//                        }
//
//                    }else {
//                        if (s1.charAt(j) == s2.charAt(i)) {
//
//                            isAnagram = true;
//                            break;
//                        }
//                    }
//                }
//                if (!isAnagram){
//                    break;
//                }
//            }
//
//            if (isAnagram){
//                System.out.println("Yes They Are Anagrams!!!!");
//            }else {
//                System.out.println("No They Are Not Anagrams Of each other");
//            }
//
//
//        }else {
//            System.out.println("No They Are Not Anagrams Of each other");
//        }
//
     }
}
