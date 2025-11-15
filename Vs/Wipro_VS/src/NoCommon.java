import java.util.*;
public class NoCommon {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(12,44,55));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(33,44,5));
        System.out.println(check(l1, l2));
    }
    static boolean check(List<Integer> l1,List<Integer> l2){
        Set<Integer> set = new HashSet<>(l1);
        for (int i = 0; i < l2.size(); i++) {
            if(set.contains(l2.get(i))) return true;
        }
        return false;
    }
}
