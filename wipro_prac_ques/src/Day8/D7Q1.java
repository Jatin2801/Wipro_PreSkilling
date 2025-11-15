package Day8;
import java.util.Scanner;

public class D7Q1 {
     public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = s.nextInt();

        A1 a = new A1(x, y);
        Thread t = new Thread(a);
        t.start();
    }

    // static class so it can be used inside main
    static class A1 implements Runnable {
        int i, j;

        A1(int x, int y) {
            i = x;
            j = y;
        }

        @Override
        public void run() {
            // Match expected output EXACTLY
            System.out.println("ARITHEMATIC OPERATIONS");
            System.out.println("SUM " + (i + j));
            System.out.println("DIFFERENCE " + (i - j));
            System.out.println(" PRODUCT  " + (i * j));   // note spaces
            if (j != 0) {
                System.out.println("RATIO  " + (i / j));  // note double spaces
            } else {
                System.out.println("RATIO Undefined (division by zero)");
            }
            System.out.println("POWER  " + Math.pow(i, j)); // note double spaces
            System.out.println("END OF A");
        }
    }
}