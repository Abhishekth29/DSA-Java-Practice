import java.util.Scanner;

public class PatternStars {

    public static void printPattern(int r) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        printPattern(r);
        sc.close();
    }
}
