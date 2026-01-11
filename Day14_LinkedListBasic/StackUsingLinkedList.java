//Implementation of Stack using Linked List
package Day14_LinkedListBasic;
public class StackUsingLinkedList {
    Node head;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    /*LOGIC:
    - Performing push and pop operation from head 
    - It will take O(1) time to insert and delete from head 
    - as no need to traverse the list for this(push and pop) */

    //Push operation:insert at head (top)
    public void push(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //Pop operation: remove head(top)
    public void pop(){
        if(head==null){
            System.out.println("\nStack is empty!Underflow");
            return;
        }
        System.out.println("\nPopped Node data:"+head.data);
        head=head.next;
    }

    //Peek operation: printing head
    public void peek(){
        if(head==null){
             System.out.println("\nStack is empty!");
            return;
        }
        System.out.println("\nPeek Node:"+head.data);
    }

    //Print Stack
    public void printStackList(){
        if(head==null){
            System.out.println("\nStack is empty!");
            return;
        }
        Node temp=head;
        System.out.println();
        while(temp!=null){
            System.out.print(" "+temp.data+" ->");
            temp=temp.next;
        }
        System.out.println(" Null");
    }
    public static void main(String[] args) {
        StackUsingLinkedList stack=new StackUsingLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.printStackList();
        stack.peek();
        stack.pop();
        stack.printStackList();
    }
}
