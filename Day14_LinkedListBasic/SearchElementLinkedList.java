//Searching the element in a Linked List
package Day14_LinkedListBasic;

public class SearchElementLinkedList {
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
    public void insertNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        //Inserting at end 
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    //PrintList
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

    //Searching
    public void searchElement(int element){
        
        if(head==null){
            System.out.println("\nList is empty!");
            return;
        }
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            if(temp.data==element){
                System.out.println("\nElement Found!");
                System.out.println("\nPosition:"+count);
                return;
            }
          temp=temp.next;
        }
        System.out.println("\nElement Not Found!");
    }
    public static void main(String[] args) {
        SearchElementLinkedList search=new SearchElementLinkedList();
        search.insertNode(10);
        search.insertNode(2);
        search.insertNode(9);
        search.insertNode(3);
        search.printList();
        search.searchElement(10);
    }
}
