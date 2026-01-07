//Count digits using recursion
package Day13_RecursionBasic;

public class CountDigitRecursion {
    public int count(int num){
        if(num==0){
            return 0;
        }
        /*LOGIC: Reduce number by num/10 and add count by 1 till num==0 (base case) */
        return 1+count(num/10);
    }
    public static void main(String[] args) {
        CountDigitRecursion countDigit=new CountDigitRecursion();
        int num=120;
        if(num==0){
            System.out.println("\nNumber of digits in "+num+": "+1);
        }
        else
        System.out.println("\nNumber of digits in "+num+": "+countDigit.count(num));
    }
}
