import java.util.Scanner;
//take 2d input and print it
class MatrixInputPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("printing a 2d matrix!");
        //take rows and columns
        System.out.println("enter no.of rows:");
        int rows = sc.nextInt();
        System.out.println("enter no.of columns:");
        int cols = sc.nextInt();
        //declaring an array
        int a[][] = new int[rows][cols];
        System.out.println("enter elements of array:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("printing the array elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(a[i][j] +" ");
            }
            System.out.println(); // for next line
        }
        sc.close();
    }    
}
