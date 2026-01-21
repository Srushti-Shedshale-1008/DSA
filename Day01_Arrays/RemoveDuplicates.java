//Remove Duplicates using two pointer
public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[]={1,2,2,2,3,4,4};
        int index=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[index]=arr[i];
                index++;
            }
        }
        System.out.println("\nAfter removing duplicates:");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
