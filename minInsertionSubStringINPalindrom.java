package Strings;

public class minInsertionSubStringINPalindrom {
    
class Solution {
    public static int minChar(String str) {
        // Write your code here
        String revStr = new StringBuilder(str).reverse().toString();
        String combined = str + "#" + revStr;
        int n = combined.length();
        int [] lps = new int [n];
        int len = 0;
        lps[0] = 0;
        int i = 1;
        
        while (i<n){
            if(combined.charAt(i) == combined.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len != 0){
                    len = lps[len - 1];
                    
                }else{
                    lps[i]= 0;
                    i++;
                }
            }
        }
        return str.length() - lps[n-1];
    }
}
}
