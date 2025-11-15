package File_hand;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Streamm {
    public static void main(String[] args) {
      // stream intermediate operations :- distinct(),map(),filter(),sorted(),skip(),limit()
      // stream terminal operations :- count(),collect(),forEach()

    //  List<String> list = new ArrayList<>(Arrays.asList("Reshma","Jatin","Suresh","Jatin"));
    //     Stream<String> nameStream = list.stream();
    //     nameStream.forEach(name -> System.out.print(name+ " ")); // this is termi. ope. now we cant operate on this stream we need to create new 
    //     System.out.println();

    //     list.stream().distinct().forEach(nam -> System.out.print(nam+ " "));

        // map (changes value)
        // Stream<Integer> ns = Stream.of(1,2,3,4,5);
        // Stream<Integer> sqnum = ns.map(num -> num*num);
        // sqnum.forEach(num -> System.out.println(num));

        // filter (filters out )
        // Stream<Integer> nus = Stream.of(2,4,5,3,10);
        // Stream<Integer> even = nus.filter(num -> num%2 == 0);
        // even.forEach(num -> System.out.println(num));

        // sorted
        // List<String> list = new ArrayList<>(Arrays.asList("Reshma","Jatin","Suresh","Jatin"));
        // Stream<String> nameStream = list.stream().sorted().distinct();
        // nameStream.forEach(name -> System.out.println(name));

        //limit
      //  Stream<Integer> nus = Stream.of(2,4,5,3,10,33,11);
      //   Stream<Integer> even = nus.limit(5);
      //   even.forEach(num -> System.out.println(num));

      //count
        // String[] names = {"Alice", "Aob", "Charlie"};
        // Stream<String> stream1 = Arrays.stream(names);
        // Long count = stream1.filter(num -> num.charAt(0) == 'A').count();
        // System.out.println(count);

        //collect
        Stream<Integer> num = Stream.of(1,4,3,2,55);
        List<Integer> list = num.collect(Collectors.toList());
        System.out.println(list);
        list.add(44);
        System.out.println(list);
    }
}
