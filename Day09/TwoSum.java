//Two Sum Problem (Brute Force Approach)
//Finding the indices of two values whose addition will be equal to the given target
package Day09;
public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,7,1,3};
        int target=10;
        /*LOGIC: 
        - Looping through array and checking for each pair using nested loop.
        - O(n^2) Time Complexity
        - Can be optimized using HashMap */
        for(int i=0;i<arr.length-1;i++){
            int j=i+1;
            while(j<arr.length){
                int sum=arr[i]+arr[j];
                if(sum==target){
                    System.out.println("\nFound Target at indices:"+i+" & "+j);
                    return;
                }
                j++;
            }
        }
        System.out.println("\nNot found any indices!");
    }
}
