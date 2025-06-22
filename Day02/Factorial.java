public class Factorial {
    public static int calculateFactorial(int n) {
        int fact = 1;
        for(int i = n; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is " + calculateFactorial(number));
    }
}
