/*Create a Java class called "Rectangle" that represents a rectangle shape. 
The class should have instance variables for the length and width of the rectangle. 
It should also have methods to calculate the area and perimeter of the rectangle. 
Write the Java class "Rectangle" according to the given specifications and
 demonstrate its usage by creating objects and invoking the methods. */
package Day4;
import java.util.Scanner;
public class D4Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        Rectangle rectangle1 = new Rectangle(length, width);
        double area1 = rectangle1.calculateArea();
        double perimeter1 = rectangle1.calculatePerimeter();

        System.out.println("Rectangle 1: ");
        System.out.println("Length: " + rectangle1.getLength());
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Area: " + area1);
        System.out.println("Perimeter: " + perimeter1);

        sc.close();
    }
}

class Rectangle {
    // your solution
    double length;
    double width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }

    double getLength() {
        return length;
    }

    double getWidth() {
        return width;
    }
}