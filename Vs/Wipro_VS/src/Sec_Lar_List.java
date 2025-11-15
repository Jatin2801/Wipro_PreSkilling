import java.util.*;
public class Sec_Lar_List {
    public static void main(String[] args) {
     List<Integer> list = new ArrayList<>(Arrays.asList(12,44,22,99));
     System.out.println(secLarge(list));
    }
    static int secLarge(List<Integer> l){
        int secmax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i<l.size() ;i++){
            if(l.get(i) > max){
                secmax =max;
                max = l.get(i);
            }
            if(l.get(i) < max && l.get(i) > secmax){
                secmax = l.get(i);
            }
        }
        return secmax;
    }
}
