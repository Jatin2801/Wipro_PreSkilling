import java.util.*;
public class Sett {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(99);
        set.add(77);
        System.out.println(set);
        set.remove(99);
        System.out.println(set);

        System.out.println(set.contains(77));
        set.clear();
        System.out.println(set);
    }
}
