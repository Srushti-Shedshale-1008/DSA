//Remove nth node from the end of the linked list (reverse approach)
package Day14_LinkedListBasic;
public class RemoveNthFromEnd{
      public Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

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

    //Reversing List
    public void reverse(){
        if(head==null){
            System.out.println("\nList is empty!");
            return;
        }
        Node prev=null;
        Node curr=head;
        Node nextNode;
        while(curr!=null){
            nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        head=prev;
    }
    //Removing Node
    public void removeNode(int n){
        if(head==null){
            System.out.println("\nList is empty!");
            return;
        }
        //if n is 1 then remove last node i.e 1st after reversing : remove head
        if(n==1){
            head=head.next;
            return;
        }
        
        /*LOGIC:
        - Reversing the linked list
        - traversing the list and maintain count variable to compare the n value
        - maintain prev and next pointers to delete the node
        - increment count while visiting each node
        - if count== n need to remove that node so remove and return
        - move pointers to traverse further 
        - at the end reverse the list again to get the original list after deletion of nth node*/

        Node curr=head.next;
        Node prev=head;
        int count=1;
        while(curr!=null){
            count+=1;
            Node nextNode=curr.next;
            if(count==n){
                prev.next=nextNode;
                return;
            }
            prev=curr;
            curr=nextNode;
        }
        System.out.println("\nEnd of list cant remove further!");
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
        RemoveNthFromEnd remove=new RemoveNthFromEnd();
        remove.insert(1);
        remove.insert(2);
        remove.insert(3);
        remove.insert(4);
        //printing original list
        remove.printList();
        //reversing to remove
        remove.reverse();
        remove.printList();
        //removing node
        remove.removeNode(2);
        remove.printList();
        //reversing again to get original
        remove.reverse();
        remove.printList();

    }
}
