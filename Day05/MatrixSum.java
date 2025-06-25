import java.util.Scanner;
public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.of rows:");
        int rows = sc.nextInt();
        System.out.println("enter no.of columns:");
        int cols=sc.nextInt();
        int a[][] = new int[rows][cols];
        System.out.println("enter elements into the array:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("sum of all elements in the array:");
        int sum=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sum = sum+a[i][j];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
