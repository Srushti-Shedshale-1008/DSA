//Reversing a string using recursion
package Day13_RecursionBasic;

public class ReverseStringRecursion {
    public void reverse(String s){
        if(s.length()==0){
             return;

        }
        /*LOGIC: 
        - Printing the String character. 
        - Reducing a string size by 1 using substring to reach base case 
        - Base case will be when the string become empty*/
        System.out.print(s.charAt(s.length()-1));
        s=s.substring(0, s.length()-1);
        reverse(s);
    }
    public static void main(String[] args) {
        ReverseStringRecursion str=new ReverseStringRecursion();
        str.reverse("null");
    }
}
