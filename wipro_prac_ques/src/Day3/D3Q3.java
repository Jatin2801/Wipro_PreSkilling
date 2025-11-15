/* Create a Java class named Book to represent a book. The class should have the following features:
Instance Variables:
title (String): to store the title of the book.
author (String): to store the name of the author.
year (int): to store the publication year of the book. */
package Day3;
public class D3Q3 {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Java Programming", "Sakshi", 2024);

        System.out.println("Book 1:");
        book1.displayInfo();

        System.out.println("Book 2:");
        book2.displayInfo();
    }
}

class Book {
    String title;
    String author;
    int year;

    Book() {
        title = "Not specified";
        author = "Unknown";
        year = 0;
    }

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println();
    }
}
