/*Rohan is given a task two return indices of pair whose sum will be equal to the given target.
Only one such pair is required. */
package Day6;

import java.util.Scanner;

public class D6Q5 {
 static int[] twoSum(int n, int[] nums, int target) {
        int[] res = new int[2];

        for(int i = 0 ; i < nums.length-1 ;i++){
            for(int j = i+1 ; j<nums.length ;j++ ){
                if(nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }

        return res;
    }
    
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        int target = in.nextInt();
        int[] ans = twoSum(n,arr,target);
        System.out.println("("+ans[0]+" , "+ans[1]+")");
    }
    
}
