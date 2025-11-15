import java.util.*;

public class RevList {
    public static void main(String[] args) {
     List<String> list = new ArrayList<>(Arrays.asList("Java","is","Fun"));
     Collections.reverse(list);
     List<String> ans = new ArrayList<>();
     StringBuilder rev = new StringBuilder();
     for(String word : list){
        rev.append(word);
         String reversedWord = rev.reverse().toString();
        ans.add(reversedWord);
        rev.setLength(0);
     }
     System.out.println(ans);
    }
}
