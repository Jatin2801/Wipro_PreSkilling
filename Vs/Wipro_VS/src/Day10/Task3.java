package Day10;
import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        String s = "Wwoords";
       System.out.println(func(s)) ;
    }
    static char func (String s){
        s = s.trim().toLowerCase();
        char[] ch= s.toCharArray();

        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < ch.length; i++) {
            map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
        }

        for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue() == 1) return e.getKey();
        }
        return '0';
    }
}
