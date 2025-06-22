public class Palindrome {
    public static boolean isPalindrome(String text) {
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            rev += text.charAt(i);
        }
        return text.equals(rev);
    }

    public static void main(String[] args) {
        String input = "level";
        System.out.println("Is \"" + input + "\" a palindrome? " + isPalindrome(input));
    }
}
