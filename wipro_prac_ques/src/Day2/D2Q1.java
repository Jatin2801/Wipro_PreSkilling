/* sum of the elements present inside the array
 Write a program to find the sum of the elements present inside the array. */
package Day2;
import java.util.Scanner;

public class D2Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        // read the array elements
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        sumArray(arr, size);
        input.close();
    }

    public static void sumArray(int[] arr, int size) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("the sum of the elements in the array = " + sum);
    }
}
