//Move Zeros to end of the array
public class MoveZeroToEnd {
    public static void main(String args[]){
        int arr[]={0,0,1,0,0};
         System.out.println("\nOriginal Array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
       
        //Clean simple
        /*LOGIC:
        - Traversing using i to find non zero
        - Maintaining index pointer to store the position to move non zero element
        - Move non zero element to index and increment it 
        - store 0 to remaining index position till the end */
        
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }

        while(index<arr.length){
            arr[index]=0;
            index++;
        }

        //Multiple Conditions, Complicated but working

       /* int i=0;
        int j=i+1;
        while(i<arr.length-1 && j<arr.length){
            if(arr[i]!=0){
                i++;
                j++;
            }
            else if(arr[i]==0 && arr[j]!=0){
                arr[i]=arr[j];
                arr[j]=0;
                i++;
                j++;
            }
           else {
                while(j<arr.length && arr[j]==0){
                    j++;
                }
                if(j==arr.length){
                    break;
                }
                arr[i]=arr[j];
                arr[j]=0;
                i++;j++;
            }
            
        }*/

        
         System.out.println("\nChanged Array:");
        for(int k=0;k<arr.length;k++){
            System.out.print(" "+arr[k]);
        }
    }
}
