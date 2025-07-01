package Day08;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string:");
        String str1 = sc.nextLine().toLowerCase();
        System.out.println("enter second string:");
        String str2 = sc.nextLine().toLowerCase();
        if(str1.length()!= str2.length()){
            System.out.println("Not Anagrams different length");
        }
        else{
            char[] arr1 =str1.toCharArray();
            char[] arr2 =str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1, arr2)){
                System.out.println("The string are anagrams");
            }
            else{
                System.out.println("The strings are not anagrams");
            }
        }
        sc.close();
    }
}
