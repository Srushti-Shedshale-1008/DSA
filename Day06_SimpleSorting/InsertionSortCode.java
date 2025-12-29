//Insertion Sort
package Day06_SimpleSorting;

public class InsertionSortCode {
    public static void main(String[] args) {
        int arr[]={5,3,7,1,9};
        int n=arr.length;
         System.out.println("\n//Original Array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        /*LOGIC: 
        -Consider first element to be sorted .
        -Start with index 1 as index 0 is sorted, current element will be stored as 'key'.
        -Compare the key with sorted array elements.
        -If key is smaller that sorted array element the shift that to right side
        -Insert Key at its correct Position */
        
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
           System.out.println("\n//Sorted Array:\n");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        
    }
}
