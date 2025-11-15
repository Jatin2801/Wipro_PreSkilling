public class Arrayss {
    public static void main(String[] args) {
    //    int[] arr = {45,22,89,11,77,56};
    //    int max = Integer.MIN_VALUE , min = Integer.MAX_VALUE;
    //    for (int i = 0; i < arr.length; i++) {
    //     if(arr[i] > max) max =arr[i];
    //     if(arr[i] < min) min = arr[i];
    //    } 
    //    System.out.println("max :" + max);
    //    System.out.println("min :" + min);

    // int[] arr = {2,5,8,9,12,15,20};
    // int even = 0 , odd = 0;
    // for (int i = 0; i < arr.length; i++) {
    //     if(arr[i] % 2 == 0){
    //         even++;
    //     }else{
    //         odd++;
    //     }
    // }
    // System.out.println(even);
    // System.out.println(odd);

    //2nd large
    int[] arr ={10,40,30,20,50};
    int max = Integer.MIN_VALUE;
    int secmax = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] > max){
            secmax = max;
            max = arr[i];
        }
        if (arr[i] < max && arr[i] > secmax) {
            secmax = arr[i];
        }
    }
    System.out.println(secmax);
    }
}
