//Implementation of queue using array
package Day12;

public class QueueUsingArray {
    public static int front=-1,rear=-1;

    //Inserting element in queue: rear end
    public void enqueue(int data,int arr[]){
        if(rear==arr.length-1){
            System.out.println("\n|OverFlow!");
            return;
        }
        if(front==-1 && rear==-1){
            front++;
            rear++;
            arr[rear]=data;
        }
        else{
            rear++;
            arr[rear]=data;
        }
    }

    //Removing element from queue: front end
    public void dequeue(int arr[]){
        if(front==-1 || front>rear){
            System.out.println("\n|Underflow!");
            return;
        }
        System.out.println("\n|Element dequeued:"+arr[front]);
        front++;

        //reset after empty
        if(front>rear){
            front=-1;
            rear=-1;
        }
    }

    //Print Queue
    public void printQueue(int arr[]){
        System.out.println("\n|Printing Queue:\n");
        if(front==-1){
            System.out.println("\n|Queue is Empty!");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(" "+arr[i]);
        }
    }

    //Peek
    public void peek(int arr[]){
        if(front==-1){
            System.out.println("\n|Queue is Empty!");
            return;
        }
        System.out.println("\n|Peek Element:"+arr[front]);
    }
    public static void main(String[] args) {
        int arr[]=new int[3];
        QueueUsingArray queue=new QueueUsingArray();

        queue.enqueue(1, arr);
        queue.enqueue(2, arr);

        queue.dequeue(arr);

        queue.printQueue(arr);

        queue.peek(arr);

      


    }
}
