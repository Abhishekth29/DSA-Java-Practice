import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("enter the string to check palindrome:");
    String palcheck = sc.nextLine();
    boolean isplan=true;
    int n = palcheck.length();
    for(int i=0;i<n/2;i++){
        if(palcheck.charAt(i)!=palcheck.charAt(n-1-i)){
            isplan=false;
        }
    }
    if (isplan) {
        System.out.println("yes it is a palindrome");
    }
    else{
        System.out.println("Not an palindrome.");
    }
    sc.close();
    }
}
