//Check if number is Palindrome
public class PalindromeNumber {
    public static void main(String[] args) {
        int num=11211;
        int check=num;
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev==check){
            System.out.println("\nNumber "+check+" is Palindrome");
        }
        else{
             System.out.println("\nNumber "+check+" is not a Palindrome!");
        }
    }
}
