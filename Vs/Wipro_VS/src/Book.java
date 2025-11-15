public class Book {
    public static void main(String[] args) {
        book_pro b1 = new book_pro("Travel", "John");
        book_pro b2 = new book_pro("Swim", "Travis");
        book_pro.total();
        b1.info();
        b2.info();
    }
}

class book_pro {
String Name;
String Author;
static int total_books;
    
book_pro(String n , String a){
total_books++;
Name = n;
Author = a;
}
static void total(){
    System.out.println("Total books : "+total_books);
}
void info(){
    System.out.println("Name is :"+ Name);
    System.out.println("Author is :" + Author);
}
}
