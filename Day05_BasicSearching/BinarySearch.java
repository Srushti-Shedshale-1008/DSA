//Implementation of Binary Search (Iterative Approach)
package Day05_BasicSearching;

public class BinarySearch {
    public static void main(String args[]){
        int arr[]={2,3,4,5,6,7};
        int val=7;
        int start=0,end=arr.length-1;
        while(start<=end){
        int mid=(start+end)/2;
            if(arr[mid]==val){
                 System.out.println("\n"+val+" is found at index:"+mid);
                return;
            }
            else if(val>arr[mid]){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
            
            mid=(start+end)/2;
           
        }
       System.out.println("\n\nNot Found\n");
      
       
    }
}
