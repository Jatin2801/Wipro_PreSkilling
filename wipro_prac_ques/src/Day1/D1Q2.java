/* Instructions: Write a program that takes two boolean values as input and performs logical 
operations (AND, OR) on them using the logical operators& print the result. */
package Day1;
import java.util.Scanner;
public class D1Q2 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean input1 = scanner.nextBoolean();
        boolean input2 = scanner.nextBoolean();
        boolean or = input1 || input2;
        boolean and = input1 && input2 ;
        System.out.println(and);
        System.out.println(or);
        scanner.close();
    }
}
