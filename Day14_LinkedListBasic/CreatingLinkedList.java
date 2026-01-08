//Implementation of LinkedList: creation | Traversal | Counting Nodes
package Day14_LinkedListBasic;

public class CreatingLinkedList {
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

    //Counting Nodes in LinkedList
    public int countList(){
        int count=0;
        if(head==null){
            return 0;
        }
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        CreatingLinkedList list=new CreatingLinkedList();
        list.insertData(1);
        list.insertData(2);
        list.printList();
        System.out.println("Number of Nodes in list:"+list.countList());
    }
}
