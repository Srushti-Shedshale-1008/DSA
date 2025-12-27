//Bubble Sort 
package Day06_SimpleSorting;

public class BubbleSortCode {
    public static void main(String[] args) {
        int arr[]={2,3,1,4,5,0};
        System.out.println("\n//Original Array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        /*LOGIC: Sorting adjacent elements*/
       for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        }

         System.out.println("\n//Sorted Array:\n");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
