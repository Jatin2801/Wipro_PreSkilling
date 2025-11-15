package Day7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Seria_demo {
    public static void main(String[] args) {
        String filename = "src/Day8/person.ser";
     Person p1 = new Person("Jatin", 21);
     try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(p1);
            System.out.println("Object has been serialized to " + filename);

        } catch (IOException e) {
            e.printStackTrace();
        }


         try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            Person deserializedPerson = (Person) in.readObject();
            System.out.println("Object has been deserialized:");
            System.out.println("Name: " + deserializedPerson.getName());
            System.out.println("Age: " + deserializedPerson.getAge());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }   
}

class Person implements Serializable{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}