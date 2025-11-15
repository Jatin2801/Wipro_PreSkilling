import java.util.*;
public class CountMap {
    public static void main(String[] args) {
        String s  = "programming";
        char[] ch = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
         Map<Character,Integer> ansmap = new HashMap<>();

        for (int i = 0; i < ch.length; i++) {
             if(map.containsKey(ch[i])){
            map.put(ch[i],map.get(ch[i])+1);
        }else{
            map.put(ch[i],1);
        }
        }
for(Map.Entry<Character,Integer> e : map.entrySet()){
    if(e.getValue() > 1){
        ansmap.put(e.getKey(), e.getValue());
    }
}
System.out.println(ansmap);

    }
}
