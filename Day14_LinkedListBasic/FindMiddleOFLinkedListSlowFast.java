//Find middle node of LinkedList: Slow-Fast Pointer
package Day14_LinkedListBasic;

public class FindMiddleOFLinkedListSlowFast {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //Insert 
    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //Print
    public void printList(){
        if(head==null){
            System.out.println("\nList is empty!");
            return;
        }
        Node temp=head;
        System.out.println();
        while(temp!=null){
            System.out.print(" "+temp.data+" ->");
            temp=temp.next;
        }
        System.out.print(" Null");
    }

    //Find middle using slow fast pointer
    /*LOGIC:
    - Slow & fast pointers are used here to find the middle
    - This method is used for better time and space complexity
    - O(n) Time and O(1) Space No extra space needed
    - Slow pointer increases by 1 i.e. node.next
    - Fast pointer increases by 2 i.e. node.next.next
    - When fast pointer reaches the last node or null then the node at slow pointer will be the mid
    -  */
    public void middleNode(){
        if(head==null){
            System.out.println("\nList is empty!");
            return;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("\nMiddle Node:"+slow.data);
    }
    public static void main(String[] args) {
        FindMiddleOFLinkedListSlowFast mid=new FindMiddleOFLinkedListSlowFast();
        mid.insert(1);
        mid.insert(2);
        mid.insert(3);
        mid.printList();
        mid.middleNode();
    }
}
