import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input string to be reversed:");
        String input = sc.nextLine();
        String reversed="";
        for(int i=input.length()-1;i>=0;i--)
        {
            reversed+=input.charAt(i);
        }
        System.out.print( "reversed string: " +reversed);
        sc.close();
    }
}
