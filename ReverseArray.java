//Approach 1: Using extra array of same size
class ReverseArray{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int reversedArr[]=new int[arr.length]; //Array of same size to store reversed array
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            reversedArr[j]=arr[i];
            j++;
        }

        System.out.print("\nOriginal array:");
           for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nReversed array:");
        for(int i=0;i<reversedArr.length;i++){
            System.out.print(reversedArr[i]+" ");
        }

    }
}

//Approach 2: Using pointers without using any extra space
class ReverseArray2{
    public static void main(String[] args) {
        int arr[]={2,6,3,1};
        int start=0;
        int end=arr.length-1;
         System.out.print("\nOriginal array:");
           for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
        }
           
        System.out.print("\nReversed array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}