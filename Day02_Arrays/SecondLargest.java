//Approach: using two pointer to store 2 numbers and solving using single loop
public class SecondLargest{
    public static void main(String[] args) {
        int arr[]={5,2};
        if(arr.length<2){
            System.out.println("Second Larget Element in Array is not Possible as it has less than 2 elements");
            return;
        }
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>first){
                second=first;
                first=num;
            }
            else if(num>second && num!=first){
                second=num;
            }
        }

        System.out.println("Second Larget Element in Array:"+second);

    }
}