public class Bank {
    public static void main(String[] args) {
        Bank_acc c1 = new Bank_acc();
        c1.set_name("Jatin");
        c1.set_no(112233);
        c1.deposit(10000);
        c1.withdraw(5000);
        c1.get_bal();
        c1.info();
    }
}
 class Bank_acc {
private String Name;
private int acc_no;
private int balance;

public void deposit(int n){
    if(n > 0){
    balance += n;
    }else{
    System.out.println("Enter positive amount");
}
}
public void withdraw(int n){
    if(n > 0 && n < balance){
    balance -= n;
}else{
    System.out.println("exceeding balance");
}
}
public void set_name(String name){
    if(name != null){
    Name = name ;
}else{System.out.println("Enter Name");}
}
public String get_name(){
return Name;
}
public void set_no(int n){
    if(n > 0){ acc_no = n;
    }else{System.out.println("Enter +ve no.");}
}
public int get_no(){
    return acc_no;
}
public void get_bal(){
    System.out.println("Balance:" + balance);
}

public void info(){
    System.out.println("Name: "+Name);
    System.out.println("Acc. no. : "+acc_no);
    System.out.println("Balance: "+balance);
}
}
/*Create a BankAccount class with private fields for account holder's name, 
account number, and balance. Implement methods to deposit and withdraw money with proper validation (e.g., no overdraft, positive amounts only). 
Provide getters and setters for the account holder's name and account number,
 but encapsulate the balance to be modified only through deposit and withdraw methods. Include a method to display account details.*/