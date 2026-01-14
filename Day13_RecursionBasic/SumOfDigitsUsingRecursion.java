//Sum of digits using Recursion
package Day13_RecursionBasic;

public class SumOfDigitsUsingRecursion {
    /*LOGIC:
    - adding the last digit to the result using num%10
    - reducing the number till base case (0) by num/10 */
    public int sum(int num){
        if(num==0) return 0;
        return (num%10)+sum(num/10);
    }
    public static void main(String[] args) {
        SumOfDigitsUsingRecursion sumOfDigit=new SumOfDigitsUsingRecursion();
        int result=sumOfDigit.sum(564);
        System.out.println("\nResult:"+result);
    }
}

/*
- 0564 will be considered as octal 
- so sum will be calculated for:
- 5*8^2 + 6*8^1 + 4*8^0
- =372
- sum(372)= 12
*/
