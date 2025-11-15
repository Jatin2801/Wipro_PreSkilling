public class Excep {
    public static void main(String[] args) {
        
        int[] arr = {2,4,3};
        try{
                System.out.println(arr[5]);
        }catch(Exception e){
            System.out.println("Error occured");
        }finally{
            System.out.println("Completed");
        }

        int a = 0 ,b =3;
        try {
            System.out.println(b/a);
        } catch (Exception e) {
        System.out.println("error: " + e.getMessage());        
    }

    }
}
