// Sum of numbers from 1 to N using Recursion
package Day13_RecursionBasic;

public class SumNumber {
    public int sumOfNumbers(int n){
        if(n==1){
            return 1;
        }
        return n+sumOfNumbers(n-1);
    }
    public static void main(String[] args) {
        SumNumber s=new SumNumber();
        System.out.println("Sum of number is: "+ s.sumOfNumbers(4));
    }
}
