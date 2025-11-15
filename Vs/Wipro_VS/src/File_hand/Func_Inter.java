package File_hand;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Func_Inter {
    public static void main(String[] args) {
        // FunctionalInterface are used in lamda funcs.
        Inte inrr = () -> System.out.println("Interface's method called");
        inrr.func();

        // we have 2 types of in-built func. inter. 
        // Consumer :- no return type but takes argu.
        // Supplier :- may take no argu. but must return something

        Consumer<Integer> con = msg -> System.out.println("no is " + msg);
        con.accept(22);

        Supplier<String> sup = () ->  "Hello from supplier ";
        System.out.println(sup.get());

        Supplier<Integer> suop = () -> 3;
        System.out.println(suop.get());

    }
}

@FunctionalInterface // FunctionalInterface can have only one abstract method
 interface Inte {
    public void func();
}