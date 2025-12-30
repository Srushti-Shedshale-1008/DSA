//Find Missing Number(Works for sorted array and 1 missing number)
package Day09;
public class FindMissingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,12};
        if(arr[0]!=1){
            System.out.println("\nMissing number:"+1);
            return;
        }
        int i=1;
        /*LOGIC: 
        - Iterate through array and check if next element is 1 more than previous 
        - else print (previous value+1) is missing */
        while(i<arr.length){
            if(arr[i]==(arr[i-1]+1)){
                i++;
            }
            else{
                System.out.println("\nMissing number:"+(arr[i-1]+1));
                return;
            }
        }
        System.out.println("\nNothing is missing!");
    }
    
}
