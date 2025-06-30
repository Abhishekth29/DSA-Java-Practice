import java.util.*;
public class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to store in a");
        int a = sc.nextInt();
        System.out.println("a= "+a);
        System.out.println("Enter number to be stored in b");
        int b = sc.nextInt();
        System.out.println("b= "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swapping:");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        sc.close();
    }
}
