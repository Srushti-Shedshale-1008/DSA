//Detect Loop in Linked List: Slow & Fast pointers
package Day14_LinkedListBasic;
public class DetectLoopLinkedList {
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
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    //Creating loop for trial
    public void loopToCheckTrial(){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head.next;
    }

    //Check loop
    /*LOGIC:
    - If slow and fast pointer meets at a node then there must be a loop. 
    - as fast pointer traversed the list and came back again in the loop 
    - if there is no loop then fast will be null or its next node will be null*/
    public void checkLoop(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                System.out.println("\nLoop Detected");
                return;
            }
            
        }
        System.out.println("\nNo loop detected");
    }

    //Print Linked List
    public void printList(){
        if(head==null){
            System.out.println("\nList is Empty!");
            return;
        }
        Node temp=head;
        System.out.println();
        while(temp!=null){
            System.out.print(" "+temp.data+" ->");
            temp=temp.next;
        }

    }
    public static void main(String[] args) {
        DetectLoopLinkedList loop=new DetectLoopLinkedList();
        loop.insert(1);
      
        loop.printList();
        // loop.checkLoop();
        loop.loopToCheckTrial();
        loop.checkLoop();
       
    }
}
