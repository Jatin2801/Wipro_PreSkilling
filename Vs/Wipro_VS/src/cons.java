public class cons {
    public static void main(String[] args) {
        Studentt s1 = new Studentt("Jatin", 'A', 22);
        s1.display();
    }
}

class Studentt{
    String name ;
    char grade ;
    int age ;

    Studentt(String n,char g,int a){
        name = n;
        grade = g;
        age =a;
    }

    public void display(){
        System.out.println("Name is:" +name);
        System.out.println("grade is: "+ grade);
        System.out.println("Age is:" +age);
    }
}
