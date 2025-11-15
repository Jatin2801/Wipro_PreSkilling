/* Write a program in java to check whether the given number is an even number or not using if else statement. */
package Day1;
import java.util.Scanner;
public class D1Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("No is Even");
        } else {
            System.out.println("No is odd");
        }
        sc.close();
    }
}
