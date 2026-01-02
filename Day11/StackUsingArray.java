public class StackUsingArray {
    public static int top=-1;
    public void push(int data,int arr[]){
        if(top==arr.length-1){
            System.out.println("Stack is full");
            return;
        }
       arr[++top]=data;
        
    }

    public void pop(int arr[]){
        if(top==-1){
            System.out.println("\nUnderflow!");
            return;
        }
        System.out.println("\nPopped element:"+arr[top]);
        
        top--;
    }
    public void printElements(int[] arr){
        if(top==-1){
            System.out.println("\nStack is empty!");
        }
        for(int i=0;i<=top;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args) {
        StackUsingArray s=new StackUsingArray();
        int arr[]=new int[3];
        
        s.push(3, arr);
        s.push(2, arr);
        s.push(4, arr);

        s.printElements(arr);
        s.pop(arr);

        s.printElements(arr);
  
        

    }
}
