//Power of digit using recursion
package Day13_RecursionBasic;

public class PowerUsingRecursion {
    public int power(int n,int p){
        if(p==0){
            return 1;
        }
        /*LOGIC: 
        - Reducing the power by 1 till power==0 (base case).
        - Multiplying by the n each time with result of smaller subproblem*/
        return n* power(n, p-1);
    }
    public static void main(String[] args) {
        PowerUsingRecursion pow=new PowerUsingRecursion();
        int powerIs=pow.power(3, 3);
        System.out.println("\n" +powerIs);
    }
}
