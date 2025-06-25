import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a square matrix(equal rows and columns)");
        System.out.println("enter no.of rows:");
        int rows, cols, sum1=0,sum2=0;
        rows = cols = sc.nextInt();
        int a[][] = new int[rows][cols];
        System.out.println("enter elements into the array:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("sum of diagonal elements:(first diagonal)");
        for(int i=0;i<rows;i++)
        {
            sum1=sum1+a[i][i];
        }
        System.out.println(sum1);
        System.out.println("sum of diagonal elements:(second diagonal)");
        for(int i=0;i<rows;i++){
            sum2=sum2+a[i][rows-1-i];
        }
        System.out.println(sum2);
        sc.close();
    }
}
