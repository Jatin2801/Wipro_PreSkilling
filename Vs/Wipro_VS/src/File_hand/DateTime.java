package File_hand;

import java.time.LocalDateTime;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        System.out.println(time.getMonth());

        LocalDateTime future = time.plusDays(30);
        System.out.println(future.getMonth());
    }
}
