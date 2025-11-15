import java.util.*;
class stu_menu {
    private String name;
    private int rollNo;
    private double marks;
    //Getters and Setters for name, rollNo, marks.
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    // private void setRollNo(int rollNo) {
    //     this.rollNo = rollNo;
    // }
    // private double getMarks() {
    //     return marks;
    // }
    public void setMarks(double marks) {
        this.marks = marks;
    }
    // Default Constructor
    stu_menu() {
        System.out.println("Default Constructor Called");
    }
    // Parameterized Constructor
    stu_menu(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.setMarks(marks);
    }
    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}
public class stu {
   
    void menu() {
        System.out.println("Menu");
        System.out.println("1. Add Student");
        System.out.println("2. Display Student");
        System.out.println("3. Search");
        System.out.println("4. Delete by roll");
        System.out.println("5. Modify by roll");
        System.out.println("0. Exit");
    }
    public static void main(String[] args) {
        stu obj = new stu();
        stu_menu[] students = new stu_menu[3]; 
         Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            obj.menu();
            System.out.print("Enter your choice: ");   
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    for(int i=0;i<students.length;i++){
                        if(students[i]==null){
                            System.out.print("Enter Name: ");                  
                            String name = sc.next();
                            System.out.print("Enter Roll No: ");
                            int rollNo = sc.nextInt();
                            System.out.print("Enter Marks: ");                  
                            double marks = sc.nextDouble();
                            students[i]= new stu_menu(name,rollNo,marks);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Student Details:");
                    for(stu_menu s : students){
                        if(s!=null){
                            s.displayInfo();
                            System.out.println("-----");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Roll No to search: ");
                    int searchRollNo = sc.nextInt();
                    for(stu_menu s : students){
                        if(s!=null && s.getRollNo() == searchRollNo){
                            s.displayInfo();
                            break;
                        }
                    }
                    break;   
                case 4:
                    System.out.print("Enter Roll No to delete: ");
                    int deleteRollNo = sc.nextInt();
                    boolean deleted = false;

                    for (int i = 0; i < students.length; i++) {
                        if (students[i] != null && students[i].getRollNo() == deleteRollNo) {
                            for (int j = i; j < students.length - 1; j++) {
                                students[j] = students[j + 1];
                            }
                            students[students.length - 1] = null; 
                            System.out.println("Student with Roll No " + deleteRollNo + " deleted successfully.");
                            deleted = true;
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Student with Roll No " + deleteRollNo + " not found.");
                    }
                    break;
                case 5:
                    System.out.println("roll to modify");
                    int roll = sc.nextInt();
                    System.out.print("Enter your choice: 1: Name , 2: Marks");   
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            for (int i = 0 ; i < students.length ;i++) {
                                if (students[i] != null && students[i].getRollNo() == roll) {
                            System.out.println("Enter name");
                            sc.nextLine();
                            String temp_name = sc.nextLine();
                            students[i].setName(temp_name); 
                                }
                            }
                            break;
                        case 2:
                        for (int i = 0 ; i < students.length ;i++) {
                                if (students[i] != null && students[i].getRollNo() == roll) {
                            System.out.println("Enter marks");
                            int temp_marks = sc.nextInt();
                                    students[i].setMarks(temp_marks); 
                                }
                            }
                            break;
                    
                        default:
                        System.out.println("Invalid choice. Please try again.");

                    }

                break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
    }
    while (choice != 0);
        sc.close();
    }
}

/* # Student application
1.⁠ ⁠Add ## done
2.⁠ ⁠display ## done
3.⁠ ⁠display one ## done
4.⁠ ⁠delete (move each element up) done
5.⁠ ⁠Modify (make nested menu in which you should ask what needs to be modifies )
6.⁠ ⁠sort as per the Marks */
