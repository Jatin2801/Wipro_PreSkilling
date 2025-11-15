public class mthds {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
    //    calc.add(5, 10); // Method Call with 
    //    calc.greet();// Methos Calling without Arguments
         calc.hello("Alice","Welcome to Java Programming!",3);
         int result = calc.multiply(4, 5);
         System.out.println("Multiplication Result: " + result);
         String message = calc.getGreetingMessage("Bob");
         System.out.println(message);
    }
    
}
class Calculator {
    int a;
    int b;
    // Method without parameters and without return type
    void greet() {
        System.out.println("Welcome to the Calculator!");
         System.out.println("Sum: from greet Method " + (a + b));
    }
    // Method with parameters and without return type
    void add(int a, int b) {
        // this.a = a;
        // this.b = b;
        System.out.println("a from add: " + a);
        System.out.println("b from b: " + b);
       
    }
    // Method with multiple parameters
    void hello(String name,String message,int count){ 
        for(int i=0;i<count;i++){
            System.out.println("Hello " + name + ", " + message);
        }
    }
    // Method with return type
    int multiply(int x, int y){
        return x * y;
    }
    String getGreetingMessage(String name){
        return "Hello, " + name + "! Welcome to the program.";
    }
       
}
