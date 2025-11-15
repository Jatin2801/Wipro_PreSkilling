import java.util.*;
public class MergeMap {
    public static void main(String[] args) {
        Map<Character,Integer> m1 = new HashMap<>();
        Map<Character,Integer> m2 = new HashMap<>();

        m1.put('a',10);
        m1.put('b',20);
        m1.put('c',30);

        m2.put('b',15);
        m2.put('c',25);
        m2.put('d',35);

        Map<Character,Integer> map = new HashMap<>(m1);

        for(Map.Entry<Character,Integer>e:m2.entrySet()){
            if(map.containsKey(e.getKey())){
                map.put(e.getKey(),map.get(e.getKey())+e.getValue());
            }else{
                map.put(e.getKey(),e.getValue());
            }
        }
        System.out.println(map);
    }
}
