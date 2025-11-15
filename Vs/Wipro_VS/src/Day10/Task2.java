package Day10;
import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(12,4,4,5,11,5));
        Set<Integer> ans = new LinkedHashSet<>(list);
        System.out.println(ans);
    }
}
