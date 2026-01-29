//Checking Palindrome String using StringBuilder
package Day03_Strings;

public class CheckPalindromeStringBuilder {
    public static void main(String[] args) {
        String str="WOW";
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        if(str.equals(sb.toString())){
            System.out.println("\nPalindrome!");
        }
        else{
            System.out.println("\nNot a palindrome!");
        }
    }
}
