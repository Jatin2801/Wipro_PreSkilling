public class Str {
    public static void main(String[] args) {
        // String s = "Hello";
        // String s1 = s + " World";
        // System.out.println(s1);
        // System.out.println(s.charAt(1));
        // System.out.println(s.indexOf("H"));
        // System.out.println(s.toUpperCase());
        // System.out.println(s1.toLowerCase());
        // System.out.println(s.length());

        StringBuilder res = new StringBuilder("Hello Jatin");
            res.reverse();
            System.out.println(res);
            res.append('j');
            res.append("jtt");
            System.out.println(res);
            res.delete(9, 11);
            System.out.println(res);
            res.replace(0, 4,"hey" );
            System.out.println(res);
    }
}
