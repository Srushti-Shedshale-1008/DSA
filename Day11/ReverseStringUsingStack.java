//Reverse the string using stack: LinkedList Implementation
public class ReverseStringUsingStack {
    Node head;
    class Node{
        char data;
        Node next;
        Node(char data){
            this.data=data;
            this.next=null;
        }
    }

    //Push:
    public void push(char data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //Pop 
    public char pop(){
        if(head==null){
            System.out.println("\nUnderflow!");
            return '-';
        }
        char ch=head.data;
        head=head.next;
        //For reference
       // System.out.println("\nPopped charater:"+ch);
        return ch;
    }
    //Peek
    public void peek(){
          if(head==null){
            System.out.println("\nStack is empty!");
           return;
        }
        System.out.println("\nPeek:"+head.data);
    }

    //Printing stack
    public void printStack(){
         if(head==null){
            System.out.println("\nStack is empty!");
           return;
        }
        Node temp=head;
        System.out.println();
        while(temp!=null){
            System.out.print(" "+temp.data+" -> ");
            temp=temp.next;
        }
        
    }
    public static void main(String[] args) {
        ReverseStringUsingStack reverse=new ReverseStringUsingStack();
        String str="what";
        for(int i=0;i<str.length();i++){
            reverse.push(str.charAt(i));
        }
        reverse.printStack();

        String reversed="";
        for(int i=0;i<str.length();i++){
            reversed=reversed+reverse.pop();
        }
        System.out.println("\nReversed String:"+reversed);
        reverse.peek();
    }
}
