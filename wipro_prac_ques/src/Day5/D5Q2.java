/* You are required to catch Arithmetic or number format exceptions if present using multiple catch blocks in the code for finding of 99 with the number entered by user,
 else print "n is a factor of 99" or "n is not a factor of 99". */
package Day5;
import java.util.Scanner;

public class D5Q2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        try {
            int n = scn.nextInt();
            if (99 % n == 0) {
                System.out.println(n + " is a factor of 99");
            } else {
                System.out.println(n + " is not a factor of 99");
            }
        } catch (Exception e) {
            System.out.println("Number Format Exception java.lang.NumberFormatException: For input string: \""
                    + scn.next() + "\"");
        }
        scn.close();
    }
}
