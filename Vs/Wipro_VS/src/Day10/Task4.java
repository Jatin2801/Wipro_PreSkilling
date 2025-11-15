package Day10;
import java.util.*;
public class Task4 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 10; i < 10000; i++) {
            if(arm(i)){
                list.add(i);
            }
        }
        System.out.println(list);
    }
    static boolean arm(int n){
        int temp = n;
        int temp2 = n;
        int pow = 0;
        int ans = 0;
        while(temp > 0){
            temp /= 10;
            pow++;
        }
        while(temp2 > 0){
        ans += Math.pow(temp2%10, pow);
        temp2 /= 10;
        }
        
        return ans == n;
    }
}
