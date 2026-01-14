//Reversing a number using recursion
package Day13_RecursionBasic;

public class ReverseNumberUsingRecursion {
    int rev=0;
    /*LOGIC:
    - Using the formula reverse=(reverse*10)+(num%10) to get the reverse
    - Reducing the number using num/10 till base case(num==0) and returning the reverse number
    */
    public int reverse(int rev,int num){
        if(num==0) return rev;
        return reverse(((rev*10)+(num%10)),num/10);
    }
    public static void main(String[] args) {
        ReverseNumberUsingRecursion reverseNumber=new ReverseNumberUsingRecursion();
        int reversenum=reverseNumber.reverse(0,123);
        System.out.println("\nreversed Number:"+reversenum);
    }
}
