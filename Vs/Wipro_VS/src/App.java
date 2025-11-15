import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers to sum:");
        int n = sc.nextInt();
        int sum = 0 ;// here change 
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter integer " + i + ":");
            int temorary = sc.nextInt();
            sum += temorary;
        }
        sc.close();
        System.out.println(sum);
    }
}

