// Frequency Using Sorting Approach
package Day04_FrequencyProblems;

import java.util.Arrays;

public class FreqOfElementsAray {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,2,1};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int count=1;
            while((i+1)<arr.length && arr[i]==arr[i+1]){
                    count++;
                    i++;
            }
            System.out.println(arr[i]+"->"+count);
        }
    }
}
