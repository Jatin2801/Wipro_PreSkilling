public class Volume {
    public static void main(String[] args) {
        vol(5,5,5);
        vol(5);
        vol(5,10);
    }
    static void vol(int l,int b , int h ){
        int ans = l*b*h;
        System.out.println("Volume is :" + ans);
    }
    static void vol(int r,int h){
        double ans = 3.14 *(r*r)*h;
        System.out.println("Volume is :" + ans);
    }
    static void vol(int r){
        double ans = 1.33*3.14*(r*r*r);
        System.out.println("Volume is :" + ans);
    }
}
