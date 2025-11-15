import java.util.*;
public class RemEleList {
    public static void main(String[] args) {
     List<Integer> list = new ArrayList<>(java.util.Arrays.asList(10,30,20,20,10,30,20,40));   
     Set<Integer> set = new LinkedHashSet<>(list);
    List<Integer> ans = new ArrayList<>(set);
    System.out.println(ans);
    }
}
