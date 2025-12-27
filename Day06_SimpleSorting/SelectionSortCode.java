//Selection Sort
package Day06_SimpleSorting;

public class SelectionSortCode {
    public static void main(String[] args) {
         int arr[]={2,3,1,4,5,0};
        System.out.println("\n//Original Array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        /*LOGIC: assume the min element and compare it with remaining array-> if there is minimum value in array update min and swap the values
        This way the smallest element will be placed at its position every time */
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
         System.out.println("\n//Sorted Array:\n");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
