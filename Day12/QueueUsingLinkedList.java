//Queue using Linked List
package Day12;

public class QueueUsingLinkedList {
    Node rear;
    Node front;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //Enqueue
    public void enqueue(int data){
        Node newNode=new Node(data);
        if(front==null){
            front=rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=rear.next;

    }
    //Dequeue
    public void dequeue(){
        if(front==null){
            System.out.println("\nQueue is Empty!");
            return;
        }
        front=front.next;

        if(front==null){
            rear=null;
        }
    }

    //Peek
    public void peek(){
           if(front==null){
            System.out.println("\nQueue is Empty!");
            return;
        }
        System.out.println("\nPeek:"+front.data);
    }
    

    //Print 
    public void printQueue(){
        if(front==null){
            System.out.println("\nQueue is Empty!");
            return;
        }
        Node temp=front;
        System.out.println();
        while(temp!=null){
            System.out.print(" "+temp.data+" ->");
            temp=temp.next;
        }

    }
    public static void main(String[] args) {
        QueueUsingLinkedList queue=new QueueUsingLinkedList();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.printQueue();
        queue.peek();
        queue.dequeue();
        queue.printQueue();
    }
}
