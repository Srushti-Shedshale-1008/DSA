//Check if Sting is Palindrome using Recursion
package Day13_RecursionBasic;

public class PalindromeStringRecursion {
    
    public String palindromeCheck(String str){
        if(str.length()==0){
            return "";
        }
        //LOGIC: Appending the last character to the string and make recursion to get the reduced substring by size 1
        return str.charAt(str.length()-1)+palindromeCheck(str.substring(0, str.length()-1));

    }
    public static void main(String[] args) {
        PalindromeStringRecursion p=new PalindromeStringRecursion();
        String str="MOM";
        String check=p.palindromeCheck(str);
        if(str.equals(check)) System.out.println("Palindrome!");
        else System.out.println("Not a palindrome!");
    }
}
