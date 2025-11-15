public class Stringbuilder {
    public static void main(String[] args) {
        String str = "Java Programming";
        str = str.toLowerCase();
        int cons = 0 ,  vow =0;    
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if(temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u'){
                vow++;
            } else{
                cons++;
            }
        }
        System.out.println(vow);
        System.out.println(cons);
    }
}
