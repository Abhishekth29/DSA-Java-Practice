package Day07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyofEachChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to lowercase (optional, if you want 'A' and 'a' treated the same)
        input = input.toLowerCase();

        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            if (ch != ' ') { // skip spaces
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        sc.close();
    }
}
