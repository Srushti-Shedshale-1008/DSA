//Finding Frequency of Each element in arrau using Hashmaps
package Day04_FrequencyProblems;

import java.util.HashMap;

public class FreqOfElementsArrayHashMap {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,2,1};    
        HashMap<Integer,Integer> map=new HashMap<>();

        /*Logic: traversing the array using loop and adding the element and incrementing its count if present already in the map else adding the new element with count 1 */

        //Using For each loop

         for(int num:arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }

        //using For loop
        
        // for(int i=0;i<arr.length;i++){
        //     if(map.containsKey(arr[i])){
        //         map.put(arr[i], map.get(arr[i])+1);
        //     }
        //     else{
        //         map.put(arr[i], 1);
        //     }
        // }
       
        System.out.println("\nFrequency Count: \n"+map);
    }
}
