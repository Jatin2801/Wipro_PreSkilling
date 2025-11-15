/* Instructions:
Write a program that takes two numbers as input from the user and performs arithmetic 
operations on them using the arithmetic operators (sum, difference, product, quotient, remainder) in Java. */
package Day1;
import java.util.Scanner;

public class D1Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int sum = n1 + n2;
        int diff = n1 - n2;
        int pro = n1 * n2;
        int quo = n1 / n2;
        int rem = n1 % n2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + pro);
        System.out.println("Quotient: " + quo);
        System.out.println("Remainder: " + rem);
        scanner.close();
    }

}
