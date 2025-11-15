import java.util.*;

public class NonRepe {
    public static void main(String[] args) {
        String s = "swiss";
        Set<Character> seenOnce = new LinkedHashSet<>();
        Set<Character> seenMultiple = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (seenMultiple.contains(c)) {
                continue;
            }
            if (seenOnce.contains(c)) {
                seenOnce.remove(c);
                seenMultiple.add(c);
            } else {
                seenOnce.add(c);
            }
        }
        if (!seenOnce.isEmpty()) {
            System.out.println("First non-repeating character: " + seenOnce.iterator().next());
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
