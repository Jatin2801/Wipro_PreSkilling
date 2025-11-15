/*Create one default constructor to initialize the fields as default values to calculate volume of the cube 
and one parameterized constructor to pass parameters and initialize them accordingly.  */
package Day3;
import java.util.Scanner;

public class D3Q4 {
     public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int b = s.nextInt();
        int h = s.nextInt();
        	
       // Constructor cuboid1 = new Constructor();
 @SuppressWarnings("unused")
        Constructor cuboid2 = new Constructor(l, b, h);
        s.close();
    }
}
class Constructor {
    int length, breadth, height;
    Constructor() {
        length = 10;
        breadth = 10;
        height = 10;
        System.out.println("Constructor without parameter");
        System.out.println("Volume is " + calculateVolume());
    }

    Constructor(int l, int b, int h) {
        this();  
        length = l;
        breadth = b;
        height = h;
        System.out.println("Constructor with parameter");
        System.out.println("Volume is " + calculateVolume());
    }

    double calculateVolume() {
        return length * breadth * height;
    }
}