import java.util.*;
public class DisplayEle {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("David");

        System.out.println("Elements in the queue:");
        for (String element : queue) {
            System.out.println(element);
        }

        System.out.println( queue);
}
}