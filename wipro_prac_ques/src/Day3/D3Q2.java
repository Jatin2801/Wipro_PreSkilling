/* Find the sum of the digits using recursion */
package Day3;
import java.util.Scanner;
public class D3Q2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = Math.abs(n);
        System.out.println(rec(r));
        sc.close();
    }
    static int rec(int num){
        if(num == 0) return num;
        return (num%10) + rec(num/10);
    }
}
