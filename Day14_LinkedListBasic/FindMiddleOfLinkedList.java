//Finding middle of linked list
package Day14_LinkedListBasic;

public class FindMiddleOfLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void insertNode(int data){
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

    public int countNodes(){
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

    /*LOGIC: 
    - Counting the nodes in linked list
    - Finding middle by (1+count)/2 i.e start of counting 1 and total counts
    - Traversing till the midddle node and printing it */
    
    public void findmiddle(){
        if(head==null){
             System.out.println("\nList is empty!");
            return;
        }
        int count=countNodes();
         int middle=(1+count)/2;
        System.out.println("\nMiddle:"+middle);
        int count1=1;
        Node temp=head;
        //Treversing to the node till middle node count
        while(count1<middle && temp!=null){  
            count1++;
            temp=temp.next;
        }
        int middleData=temp.data;
        System.out.println("\nMiddle Node data is:"+middleData);
    }

    public static void main(String[] args) {
        FindMiddleOfLinkedList middleOfLinkedList=new FindMiddleOfLinkedList();
        middleOfLinkedList.insertNode(1);
        middleOfLinkedList.insertNode(2);
        middleOfLinkedList.insertNode(3);
        middleOfLinkedList.insertNode(4);
        middleOfLinkedList.insertNode(5);
        middleOfLinkedList.insertNode(6);
        middleOfLinkedList.printList();
        int count=middleOfLinkedList.countNodes();
        System.out.println("\nNumber of Nodes:"+count);
        middleOfLinkedList.findmiddle();
       
       
    }
}
