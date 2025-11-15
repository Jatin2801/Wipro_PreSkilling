/*Write a program that takes input from the user and creates an object of a class named 'Person'.
 The 'Person' class should have two member variables: 'name' and 'age'. The program should prompt the user to enter their name and age, 
create a 'Person' object with the entered values, and then display the name and age of the person. */
package Day3;
import java.util.Scanner;
public class D3Q1 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        Person p = new Person();
        p.name = name;
        p.age = age;
        p.printt();
        sc.close(); 
    }
}
 class Person {
    String name;
    int age;
    void printt() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}