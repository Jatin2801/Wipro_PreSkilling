import java.util.*;
public class SetCommon {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(3,4,5,6));
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>(l1);
        for (int i = 0; i < l2.size(); i++) {
            if(set.contains(l2.get(i))){
                ans.add(l2.get(i));
            }
        }
        System.out.println(ans);
    }
}
