package Day10;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
     public static void main(String[] args) {
        String s = "How many words how many times ";
        function(s);
    }
    static void function(String s ){
          s = s.trim().toLowerCase();
        String[] str = s.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0 ; i < str.length ; i++){
            if(map.containsKey(str[i])){
                map.put(str[i],map.get(str[i])+1);
            }else{
                map.put(str[i],1);
            }
        }
        System.out.println(map);
    }
}
