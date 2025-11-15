public class mrks {
    public static void main(String[] args) {
        Student s1 = new Student("Jatin");
        s1.set_marks(80);
        System.out.println(s1.get_marks());
    }
    
}
 class Student {
String Name;    
 private int marks;
    Student(String Name){
        this.Name = Name;
    }

    public void set_marks(int m ){
        marks=m;
    }
    public int get_marks(){
        return marks;
    }
}
