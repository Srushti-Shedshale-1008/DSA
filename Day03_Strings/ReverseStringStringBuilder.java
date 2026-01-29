//Reversing String Using StringBuilder
package Day03_Strings;

public class ReverseStringStringBuilder {
    public static void main(String[] args) {
        String str="Reverse";
        System.out.println("\nOriginal string:"+str);
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println("\nReversed string:"+sb);
    }
}
