/* LinkedList Operation: 
- Insert at Beginning 
- Insert at end
- Delete Node as per data*/
package Day14_LinkedListBasic;

public class LinkedListOperations {
    Node head;
    public class Node{
        int data;
        Node  next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //Insert at beginning: (Fastest as no need to traverse)
    public void insertAtBeginning(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //Insert at end
    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    //Delete by data
    public void deleteNodeByData(int data){
        if(head==null){
            System.out.println("!List is empty can't delete!");
            return;
        }
        //1st node has that data to be removed
         if(head.data==data){
                head=head.next;
                return;
            }
        Node temp=head;
        Node prev=null;
        while(temp!=null){
           
            if(temp.data==data){
                prev.next=temp.next;
                return;

            }
            prev=temp;
            temp=temp.next;
        }
    }

    //Printing List
    public void printList(){
        if(head==null){
            System.out.println("List is empty!");
            return;
        }
        System.out.println();
        Node temp=head;
        while(temp!=null){
            System.out.print(" "+temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print(" Null");
    }
    public static void main(String[] args) {
        LinkedListOperations op=new LinkedListOperations();
        op.insertAtBeginning(1);
        op.printList();
        op.insertAtBeginning(0);
        op.printList();
        op.insertAtEnd(2);
        op.printList();
        op.deleteNodeByData(0);
        op.printList();
        op.deleteNodeByData(2);
        op.printList();
    }
}
