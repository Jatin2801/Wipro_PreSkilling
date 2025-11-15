public class cls {
    public static void main(String[] args) {
        @SuppressWarnings("unused") // annotation to supress book1 warning
        Book book1 = new Book();
        Book book2 = new Book("Aaa","bbb");
        System.out.println("----Book 2 Info----");
        book2.displayInfo();
        System.out.println("----Book 3 Info----");
 Book book3 = new Book(999.99);   
        book3.displayInfo();

    }
}
class Book {
    // Data Members
    String title = "Unknown";
    String author = "ABC" ;
    double price = 500.00;
    Book(){
        System.out.println("Default Constructor Called");
    }
    // Parameterized Constructor
    Book(double price) {
        // this.title = title;
        // this.author = author;
        this("check","check");
        this.price = price;
    }
     // Parameterized Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        // this.price = price;
    }
    void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
} 
