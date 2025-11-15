/* You are given a string s. In one move you can change any character to another character.
You have to make a string which consists of the same character. Find the minimum move to do this task. */
package Day2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D2Q4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        int result = calculateMinimumMoves(s);
        System.out.println(result);
    }

    static int calculateMinimumMoves(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        Map<Character, Integer> charFrequencies = new HashMap<>();
        for (char c : s.toCharArray()) {
            charFrequencies.put(c, charFrequencies.getOrDefault(c, 0) + 1);
        }

        int maxFrequency = 0;
        for (int frequency : charFrequencies.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        int totalLength = s.length();
        int minimumMoves = totalLength - maxFrequency;

        return minimumMoves;
    }
}
