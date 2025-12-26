//Finding the frequency of characters in a string using HashMap
package Day04_FrequencyProblems;
import java.util.HashMap;

public class FreqOfCharInString {
    public static void main(String[] args) {
        String str="ABABCAAA";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i), 1);
            }
        }

        System.out.println("\nFrequency Of Characters in String:\n"+map);
    }
}
