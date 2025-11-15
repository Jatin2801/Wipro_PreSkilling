/*students are provided with a challenge to sort the given arraylist in the lesser lines of code. 
Student with minimum lines will win , try to write a code for it in less lines and win */
package Day6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class D6Q1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 0 ; i < 4 ;i++){
        int temp = sc.nextInt();
        list.add(temp);
    }
    System.out.println("List before sort: "+list);
    Collections.sort(list);
    System.out.println("List after sort: "+list);
    }
}
