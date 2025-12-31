//Check Anagram (Sorting approach)
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silenw";
        // if length of strings is different no need to check further
        if(str1.length()!=str2.length()){
            System.out.println("\nNot Anagram!");
            return;
        }

        /*LOGIC:
        -Converting strings to chacter array
        -Sorting arrays
        -Check if elements are same iteratively and print result */
        
      char[] ch1= str1.toCharArray();
       char[] ch2 =str2.toCharArray();
       Arrays.sort(ch1);
       Arrays.sort(ch2);
      int i=0;
      
      while(i<ch1.length){
        if(ch1[i]==ch2[i]){
            i++;
        }
        else{
            System.out.println("\nNot anagram!");
            return;
        }
      }
      System.out.println("\nAnagram");
    }
}
