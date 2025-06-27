import java.util.*;
public class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string to check the vowel count:");
        String str = sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
           ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
           count++;
           }
        }
        System.out.println("Total no of vowels in the entered string is " +count);
        sc.close();
    }
}
