public class Main {
    public static void main(String[] args) {
       // Constructor cuboid1 = new Constructor();
       //Cons cuboid2 = new Cons(2, 2, 2);
    }
}

class Cons {
    int length, breadth, height;

    Cons() {
        length = 10;
        breadth = 10;
        height = 10;
        System.out.println("Constructor without parameter");
        System.out.println("Volume is " + calculateVolume());
    }

    Cons(int l, int b, int h) {
        this();  // this is calling the no para. cons.
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