import java.util.*;
public class MergeList {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(12,44,22));
    List<Integer> l2 = new ArrayList<>(Arrays.asList(22,33));
    List<Integer> ans = new ArrayList<>();

   ans.addAll(l1);
    for(int i = 0 ; i < l2.size() ; i++){
        if(!ans.contains(l2.get(i))){
        ans.add(l2.get(i));}
    }

    Collections.sort(ans);
    System.out.println(ans);
    }
}
