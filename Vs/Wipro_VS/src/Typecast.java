public class Typecast {
    public static void main(String[] args) {
     int n = 10;
     double dou = n; // implicit 
     System.out.println(dou);

     int n2 = (int) dou;
     System.out.println(n2); //explicit

     Animall a = new Dogg(); // upcasting
     a.sound();

     Dogg d = (Dogg) a; //downcasting
        d.fetch();
        d.sound();
    }
}

class Animall {
    void sound() { System.out.println("Animal makes sound"); }
}

class Dogg extends Animall {
    void sound() { System.out.println("Dog barks"); }
    void fetch() { System.out.println("Dog fetches ball"); }
}
