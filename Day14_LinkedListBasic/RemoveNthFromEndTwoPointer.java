//Remove nth node from end of the linked list (Two pointer approach)
package Day14_LinkedListBasic;

public class RemoveNthFromEndTwoPointer {
      public Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //Insert node
    public void insert(int data){
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

    //Remove nth node

    /*LOGIC:
    - Maintain two pointers slow and fast
    - keep the gap between these pointers of size n
    - i.e fast will be initialized to head first then move fast till n using for loop
    - initialize slow to head 
    - move slow and fast pointer by 1 each time till fast.next become null
    - when we reach fast.next the slow pointer will be exactly 1 node behind the nth node to be deleted from end
    - adjust the next of current slow to delete the nth node */
    public void removeNthNode(int n){
        Node fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        //after moving fast n time if it becomes null that means it has exactly n nodes 
        // so need to remove the head
        if(fast==null){
            head=head.next;
            return;
        }
        Node slow=head;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;

    }

    public void printList(){
        if(head==null){
            System.out.println("\nList is empty!");
            return;
        }
        Node temp=head;
        System.out.println();
        while(temp!=null){
            System.out.print(" "+temp.data+"->");
            temp=temp.next;
        }
        System.out.print(" null");
    }
    public static void main(String[] args) {
        RemoveNthFromEndTwoPointer r=new RemoveNthFromEndTwoPointer();
        r.insert(1);
        r.insert(2);
        r.insert(3);
        r.insert(4);
        r.insert(5);
        r.printList();
        
        r.removeNthNode(2);
        r.printList();
    }
}

