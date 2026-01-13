//Checking if String is Palindrome using stack
public class PalindromecheckUsingStack {
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
        PalindromecheckUsingStack palindrome=new PalindromecheckUsingStack();

        String str="WOW";
        for(int i=0;i<str.length();i++){
            palindrome.push(str.charAt(i));
        }
        palindrome.printStack();

        //Reverse String:
        String reversed="";
        for(int i=0; i<str.length(); i++){
            reversed= reversed + palindrome.pop();
        }
        System.out.println("\nReversed String:"+reversed);

        //Checking palindrome
        if(str.equals(reversed)){
            System.out.println("\n"+str+" Is Palindrome String!");
        }
        else{
            System.out.println("\nNot a Palindrome!");
        }
       
    }


}
