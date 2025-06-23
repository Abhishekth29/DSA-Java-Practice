import java.util.Scanner;

public class WordCount {

    // Method to count the number of words in a string
    public static int count(String str) {
        int counts = 0;
        boolean inWord = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                if (!inWord) {
                    counts++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        return counts;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        System.out.println("Word count: " + count(str));
        sc.close();
    }
}
