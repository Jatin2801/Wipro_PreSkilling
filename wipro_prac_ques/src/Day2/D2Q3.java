/* Write a function to reverse each word in a string. */
package Day2;
import java.util.Scanner;

public class D2Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        System.out.println(func(test));
        sc.close();
    }

    static String func(String s) {
        String[] arr = s.split(" ");
        StringBuilder res = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            temp.append(arr[i]);
            temp.reverse();
            res.append(temp).append(" ");
            temp.setLength(0);
        }
        return res.toString();
    }
}
