//Print 1 to N numbers using Recursion
package Day13_RecursionBasic;

public class PrintOneToN {
    /*LOGIC: 
    - Print the number after recursion.
    - So that it will be printed while backtracking.
    - i.e. It will make recursive calls then start printing form 1
    */
    public void printNum(int n){
          if(n==1){
            System.out.println(" "+1);
            return;
        }
       printNum(n-1);
        System.out.println(" "+n);
    }
    public static void main(String[] args) {
        PrintOneToN p=new PrintOneToN();
        p.printNum(3);
        
    }
}
