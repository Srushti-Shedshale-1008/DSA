//Print N to 1 numbers using Recursion
package Day13_RecursionBasic;

public class PrintingNumbers {
 
    public static void printnum(int n){

        /* LOGIC: - Print the number before recursion. */
        
        if(n==1){
            System.out.println(" "+ 1);
            return;
        }
        System.out.println(" "+n);
        printnum(n-1);
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println();
        printnum(n);
    }
}
