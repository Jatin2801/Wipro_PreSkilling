/* Write a Java program that takes two integers as input and performs division. The program should handle exceptions 
for invalid input (non-integer input) and division by zero. 
The program should continue to prompt the user for valid input until successful division is performed. */
package Day5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class D5Q1 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        while (true) {
            try {
                num1 = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.nextLine(); // clear invalid input
            }
        }

        while (true) {
            try {
                num2 = sc.nextInt();

                if (num2 == 0) {
                    System.out.println("Cannot divide by zero. Please enter a valid divisor.");
                    continue;
                }

                int result = num1 / num2;
                System.out.println("Result: " + result);
                break;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.nextLine();
            }
        }

        sc.close();
    }    
}
