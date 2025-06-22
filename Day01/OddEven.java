public class OddEven {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int even = 0, odd = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i] + " is an even number");
                even++;
            } else {
                System.out.println(a[i] + " is an odd number");
                odd++;
            }
        }

        System.out.println("Total even: " + even);
        System.out.println("Total odd: " + odd);
    }
}
