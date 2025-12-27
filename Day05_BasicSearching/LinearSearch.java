//Implementation of Linear Search
package Day05_BasicSearching;

public class LinearSearch {
    public static void main(String args[]){
        int arr[]={12,21,23,76,54};
        int val=21;

        //### Using for loop ###
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                System.out.println("\n"+val+" is found at index:"+i);
                return;
            }

        }
        System.out.println("\nValue not found");



        // ### Using while loop ###
        // System.out.println("\nUsing while:\n");
        // int i=0;
        // while(i<arr.length ){
        //     if(arr[i]==val){
        //         System.out.println("\n"+val+" is found at index:"+i);
        //         return;
        //     }
        //     i++;
        // }
        // System.out.println("\nValue not found!");
       
    }
}
