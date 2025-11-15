/*You are tasked with building an enhanced Library Management System in Java.
 The system manages different types of items in the library, such as books, DVDs, and magazines.  
 Each item has common attributes like title, author/creator, a unique identifier, 
and a status indicating whether it is checked out or available. */
package Day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ch = scanner.nextInt();

        if (ch == 1) { // Display Books
            Library<Book> bookLibrary = new Library<>();
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                int id = scanner.nextInt();
                scanner.nextLine();
                String name = scanner.nextLine();
                String author = scanner.nextLine();
                int numpages = scanner.nextInt();
                Book book = new Book(id, name, author, numpages);
                bookLibrary.addItem(book);
            }
            bookLibrary.displayItems();
        } else if (ch == 2) { // Display DVDs and Magazines
            Library<DVD> dvdLibrary = new Library<>();
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                int id = scanner.nextInt();
                scanner.nextLine();
                String name = scanner.nextLine();
                String director = scanner.nextLine();
                int duration = scanner.nextInt();
                DVD dvd = new DVD(id, name, director, duration);
                dvdLibrary.addItem(dvd);
            }

            Library<Magazine> magazineLibrary = new Library<>();
            n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                int id = scanner.nextInt();
                scanner.nextLine();
                String name = scanner.nextLine();
                String publisher = scanner.nextLine();
                int issueNo = scanner.nextInt();
                Magazine magazine = new Magazine(id, name, publisher, issueNo);
                magazineLibrary.addItem(magazine);
            }
            dvdLibrary.displayItems();
            magazineLibrary.displayItems();
        } else if (ch == 3) { // Check out item
            Library<Book> bookLibrary = new Library<>();
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                int id = scanner.nextInt();
                scanner.nextLine();
                String name = scanner.nextLine();
                String author = scanner.nextLine();
                int numpages = scanner.nextInt();
                Book book = new Book(id, name, author, numpages);
                bookLibrary.addItem(book);
            }

            int itemId = scanner.nextInt();

            try {
                if (bookLibrary.checkOutItem(itemId)) {
                    System.out.println("Item " + itemId + " checked out successfully.");
                } else {
                    System.out.println("Item " + itemId + " not found in the library.");
                }
            } catch (ItemAlreadyCheckedOutException e) {
                System.out.println(e.getMessage());
            }
        } else if (ch == 4) { // Return item
            Library<Magazine> magazineLibrary = new Library<>();
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                int id = scanner.nextInt();
                scanner.nextLine();
                String name = scanner.nextLine();
                String publisher = scanner.nextLine();
                int issueNo = scanner.nextInt();
                Magazine magazine = new Magazine(id, name, publisher, issueNo);
                magazine.checkedOut = true;
                magazineLibrary.addItem(magazine);
            }

            int itemId = scanner.nextInt();

            try {
                if (magazineLibrary.returnItem(itemId)) {
                    System.out.println("Item " + itemId + " returned successfully.");
                } else {
                    System.out.println("Item " + itemId + " not found in the library.");
                }
            } catch (ItemNotCheckedOutException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
class LibraryItem {
    private int itemId;
    private String title;
    private String creator;
    public boolean checkedOut;

    public LibraryItem(int itemId, String title, String creator) {
        this.itemId = itemId;
        this.title = title;
        this.creator = creator;
        this.checkedOut = false;
    }

    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getCreator() {
        return creator;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkOut() {
        if (checkedOut)
            throw new ItemAlreadyCheckedOutException(itemId);
        checkedOut = true;
    }

    public void returnItem() {
        if (!checkedOut)
            throw new ItemNotCheckedOutException(itemId);
        checkedOut = false;
    }

    @Override
    public String toString() {
        return "Item ID: " + itemId + "\nTitle: " + title + "\nCreator: " + creator + "\nChecked Out: " + checkedOut;
    }
}

// Custom Exceptions
class ItemAlreadyCheckedOutException extends RuntimeException {
    public ItemAlreadyCheckedOutException(int itemId) {
        super("Item " + itemId + " is already checked out");
    }
}

class ItemNotCheckedOutException extends RuntimeException {
    public ItemNotCheckedOutException(int itemId) {
        super("Item " + itemId + " is not checked out");
    }
}

// Book class
class Book extends LibraryItem {
    private int numPages;

    public Book(int itemId, String title, String author, int numPages) {
        super(itemId, title, author);
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: Book\nNumber of Pages: " + numPages;
    }
}

// DVD class
class DVD extends LibraryItem {
    private int duration;

    public DVD(int itemId, String title, String director, int duration) {
        super(itemId, title, director);
        this.duration = duration;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: DVD\nDuration: " + duration + " minutes";
    }
}

// Magazine class
class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(int itemId, String title, String publisher, int issueNumber) {
        super(itemId, title, publisher);
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: Magazine\nIssue Number: " + issueNumber;
    }
}

// Generic Library class
class Library<T extends LibraryItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
            System.out.println("-------------");
        }
    }

    public boolean checkOutItem(int itemId) {
        T item = findItem(itemId);
        if (item != null) {
            item.checkOut();
            return true;
        }
        return false;
    }

    public boolean returnItem(int itemId) {
        T item = findItem(itemId);
        if (item != null) {
            item.returnItem();
            return true;
        }
        return false;
    }

    private T findItem(int itemId) {
        for (T item : items) {
            if (item.getItemId() == itemId) {
                return item;
            }
        }
        return null;
    }
}