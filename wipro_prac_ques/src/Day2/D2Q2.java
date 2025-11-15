/* Write a program that takes the row & columns input from the user to populate a 2D array and then prints the array. */
package Day2;
import java.util.Scanner;
public class D2Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] ans = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
