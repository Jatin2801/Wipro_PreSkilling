public class Inheri {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.walk();
        d.bark();

        Cat c = new Cat();
        c.sound();
        c.walk();

        Pitbull p = new Pitbull();
        p.trait();
        p.walk();
        p.bark();

        german_shepherd g = new german_shepherd();
        g.look();
        g.h();
        g.name();
        g.go();
    } 
}

 class Animal {
void walk(){
    System.out.println("It walks");
}    
}

 class Dog extends Animal {
    void bark(){
        System.out.println("It barks");
    }
    
}
  class Cat extends Animal {
 void sound(){
    System.out.println("Meow");
 }
 }

  class Pitbull extends Dog {
 
    void trait (){
        System.out.println("Its dangerous");
    }
 }

  interface color {
    void go();
    default void look(){
        System.out.println("its white");
    }

 }

 interface height {

    default void h(){
        System.out.println("its 4ft");
    }

 }

class german_shepherd implements color,height {
   public void go(){
System.out.println("its going");
    }
 void name(){
    System.out.println("Name is honey");
 }

 }