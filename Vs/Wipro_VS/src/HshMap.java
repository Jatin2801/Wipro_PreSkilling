import java.util.*;
public class HshMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
       String s = "what a beautiful day it is with a beautiful weather";
       String[] str = s.split(" ");
       for (int i = 0; i < str.length; i++) {
        if(map.containsKey(str[i])){
            map.put(str[i],map.get(str[i])+1);
        }else{
            map.put(str[i],1);
        }
       }
       System.out.println(map);
    }
}
