//Two Sum problem using two pointer approach
package Day09;

import java.util.Arrays;

public class TwoSumTwoPointer {
    //In this approach the orders of elements in array get changed due to sorting
    // So it is helpfull when order does not matter
    public static void main(String[] args) {
         int arr[]={2,7,1,3};
        int target=10;
        int start=0;
        int end=arr.length-1;
        //Sort array so that we can compare the sum and move the start and end pointers
        Arrays.sort(arr);
        System.out.println("\nArray:");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        while(start<=end){
            int sum=arr[start]+arr[end];
            if(sum==target){
                System.out.println("\nSum found at index:"+start+" & "+end);
                return;
            }
            //if sum is greater than the target then we need to decrease the end as it is going beyond the target
            else if(sum>target){
                end--;
            }
            //if sum is less than target we need to increment start as we need the value greater than the current one
            else{
                start++;
            }
        }
        System.out.println("\nNot found!");
    }
}
