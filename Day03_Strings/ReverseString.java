package Day03_Strings;
public class ReverseString {
    public static void main(String[] args) {
        String str="Reverse";
        String reversedStr="";
        for(int i=str.length()-1;i>=0;i--){
            reversedStr=reversedStr+str.charAt(i);
        }
        System.out.println("Original String:"+str+"\nReversed String:"+reversedStr);
    }
}
