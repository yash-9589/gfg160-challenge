package Strings;

public class Anagram {
    
class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s, String t) {

        // Your code here
        int sl = s.length();
        int tl = t.length();
        
        if(sl != tl) return false;
        
        int [] arr = new int [26];
        
        for(int i = 0; i<s.length(); i++){
            arr[s.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i<t.length(); i++){
            arr[t.charAt(i) - 'a']--;
        
        
        if(arr[t.charAt(i) - 'a'] < 0)
            return false;
        }
        return true;
    }
}
}
