//Check if strings are anagram using hashmap
import java.util.HashMap;
import java.util.Set;
public class AnagramCheckHashMap {
    public static void main(String[] args) {
          String str1="listen";
        String str2="silent";
        if(str1.length()!=str2.length()){
            System.out.println("\nNot an anagram!");
            return;
        }
        /*LOGIC:
        - Creating a map of character and integer to store character(Key) and its count(Value) 
        - Traversing first String and if character is already present then increment count else add it as 1 
        - Traverse second String and if character of escond string is present in map then decrement it by 1
        - if all elements are same then count of each charater will become 0 as we decrement it at each match
        - if count of value for any key(character) is not 0 then not anagram */


        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            if(map.containsKey(str1.charAt(i))){
                map.put(str1.charAt(i), map.get(str1.charAt(i))+1);
            }
            else{
                map.put(str1.charAt(i), 1);
            }
        }

        System.out.println(map);

        for(int i=0;i<str2.length();i++){
            if(map.containsKey(str2.charAt(i))){
                map.put(str2.charAt(i), map.get(str2.charAt(i))-1);
            }
            else{
                System.out.println("\nNot an anagram!");
                return;
            }
           
        }

        //using set to store the keys of map
        Set<Character>keys=map.keySet(); 
        for(Character key:keys){
            if(map.get(key)!=0){
                 System.out.println("\nNot an anagram!");
                return;
            }    
        }
        System.out.println("\nAnagram!");
    }
}
