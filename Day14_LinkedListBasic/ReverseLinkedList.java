//Reversing Linked List
package Day14_LinkedListBasic;

public class ReverseLinkedList {
      Node head;
     

    //Creating a node
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //Inserting a node:at end
    public void insertData(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
        
    }

    //Traversing a linkedList and printing 
    public void printList(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(" " +temp.data+" ->");
            temp=temp.next;
        }
        System.out.println(" Null");
    }

    /*LOGIC: 
    - Maintaining pointers to store current, previous and next nodes  
    - Reversing the links between nodes using these pointers*/
    public void reverseList(){
        if(head==null){
            System.out.println("\nList is Empty! Can't reverse");
            return;
        }
         Node curr=head;
         Node nextNode;
        Node prev=null;
        while(curr!=null){
           nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
            
        }
         head=prev;
        
    }
    public static void main(String[] args) {
        ReverseLinkedList reverse=new ReverseLinkedList();
        reverse.insertData(1);
        reverse.insertData(2);
        reverse.insertData(3);
        reverse.insertData(4);
        reverse.insertData(5);
        reverse.printList();
        reverse.reverseList();
        reverse.printList();
    }
    
}
