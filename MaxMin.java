//Approach 1: Using Arrays.sort 
import java.util.*;
public class MaxMin {
    public static void main(String[] args) {
        int arr[]={8,2,3,4,5};
        Arrays.sort(arr);
        System.out.println("\nMinimum value: "+arr[0]+" Maximum value:"+arr[arr.length-1]);

    }
}

//Approach 2: Using pointers and single loop
class MaxMin2{
    public static void main(String[] args) {
        int arr[]={34,21,76,12,90,432};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("\nSecond approach:");
        System.out.println("\nMinimum value: "+min+" Maximum value:"+max);
    }
}