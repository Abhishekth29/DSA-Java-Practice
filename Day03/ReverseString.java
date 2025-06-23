import java.util.Scanner;

public class ReverseString {

    public static String reverseString(String original) {
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        return reverse;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String input = sc.nextLine();
        System.out.println("Reversed string: " + reverseString(input));
        sc.close();
    }
}
