import java.util.*;
public class Queu {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
         queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("First element: " + queue.peek());

        // Remove one element from the queue (dequeue)
        int removed = queue.remove();

        // Print the removed element
        System.out.println("Removed element: " + removed);

        // Print the queue after removal
        System.out.println("Queue after removal: " + queue);
    }
}
