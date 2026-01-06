//Factorial of a number using recursion
package Day13_RecursionBasic;

public class Factorial {
    public int factorial(int n){
        //Base case: factorial of 0 and 1 is 1.
        // So when we find 0 or 1 we will return 1
        if(n==0 || n==1){
            return 1;
        }

        /*LOGIC: 
        - Factorial(n)=n*(n-1)*.....*(1) 
        - Factorial(n)=n*Factorial(n-1)
        - Eg. Factorial of 4= 4*3*2*1
        - i.e. Factorial(4)=4* Factorial(3) =4*3*2*1
        */
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Factorial f=new Factorial();
        int fact=f.factorial(6);
        System.out.println("\nFactorial is: "+ fact);
        
    }
}
