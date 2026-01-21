//Two sum problem using Hashmap
package Day09;

import java.util.HashMap;

public class TwoSumHashmap {
    public static void main(String[] args) {
         int arr[]={2,7,1,3};
        int target=4;
        /*LOGIC:
        - Using hashmap to store the current value and its index
        - Finding the complementary of current value for target : target-currentValue 
        - Checking if map contains that complementary value
        - If the value is present in map then result found else add that element to map and check for the next
        */
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complementary=target-arr[i];
            if(map.containsKey(complementary)){
                System.out.print("\nPair Found at index:"+map.get(complementary)+" & "+ i);
                return;
            }
             map.put(arr[i],i);
        }
        System.out.println("\nNot found!");
    }
}
