import java.util.*;
// public class rev {
//     public static void main(String[] args) {
//         int n =2345;
//         int res = 0;
//         while(n>0){
//             int rem = n % 10;
//             res = res * 10 + rem;
//             n = n / 10;
//         }
//     System.out.println(res);
// }}

//  public class tasks {
//     public static void main(String[] args) {
//         int n = 6;
//         int res = 1;
//         for( int i = n ; i>1 ;i--){
//             res *= i;
//         }
//         System.out.println(res);
//     }
// }

public class tasks {
public static void main(String[] args) {
     int a = 0;
     int b = 1;
     List<Integer> list = new ArrayList<>();
     list.add(a);
     list.add(b);
     for(int i = 1 ; i<10;i++ ){
          int c = a+b;
           a = b;
          b = c;
          list.add(b);
     }
     System.out.println(list);
}
    
}