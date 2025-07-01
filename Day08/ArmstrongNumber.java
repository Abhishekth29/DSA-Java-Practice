import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check armstrong or not:");
        int num = sc.nextInt();
        int count = String.valueOf(num).length();
        int origin =num;
        int sum = 0;
        while (num!= 0) {
            int digit = num % 10;
            sum += Math.pow(digit, count); // raise each digit to 'digits' power
            num = num / 10;
        }
        if(sum==origin){
            System.out.println("its armstrong!");
        }
        else{
            System.out.println("no its not armstrong");
        }
        sc.close();
    }
    
}
