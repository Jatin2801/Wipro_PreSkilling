/*Create a superClass Vehicle that has a method noOfWheels() of return type void and accepts no parameters. 
Create two subclasses Scooter and Car which has method noOfWheels()  
noOfWheels() of Vehicle should display “No of wheels undefined”.
noOfWheels() of Scooter should display “No of wheels 2”.
noOfWheels() of Car should display “No of wheels 4”. */
package Day4;
public class D4Q2 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Scooter s = new Scooter();
        Car c = new Car();
        v.noOfWheels();
        s.noOfWheels();
        c.noOfWheels();
    }
}
class Vehicle{
    void noOfWheels(){
        System.out.println("No of wheels undefined");
    }
}

class Scooter extends Vehicle{
    void noOfWheels(){
        System.out.println("No of wheels 2");
    }
}

class Car extends Vehicle{
    void noOfWheels(){
        System.out.println("No of wheels 4");
    }
}