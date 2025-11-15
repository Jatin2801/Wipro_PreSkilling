import java.util.*;
public class UniqueWords {
    public static void main(String[] args) {
        String s = "Java is fun and Java is powerful";
        String[] str = s.split(" ");
        int count = 0 ;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < str.length; i++) {
            if(set.contains(str[i])){
                continue;
            }else{
                set.add(str[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}
