package Strings;

import java.util.HashMap;
import java.util.Map;

public class firstNonRepeatingCharacter {
    class Solution {
    static char nonRepeatingChar(String str) {
        // code here
        Map<Character , Integer> hashMap = new HashMap<>();
        for(Character ch : str.toCharArray()){
            if(hashMap.containsKey(ch)){
                hashMap.put(ch,hashMap.get(ch) + 1);
            }else{
                hashMap.put(ch,1);
            }
        }
        for(int i = 0; i<str.length();i++){
            char c = str.charAt(i);
            if(hashMap.get(c) == 1){
                return c;
            }
        }
        return '$';
    }
}

}
