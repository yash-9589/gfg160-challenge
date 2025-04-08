package Strings;

import java.util.ArrayList;

public class kmpAlgorithm {
    
class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        int k = pat.length();
        ArrayList<Integer> res = new ArrayList<>();
        String combined = pat + "#" + txt;
        int n = combined.length();
        int [] lps= new int [n];
        int len = 0;
        lps[0] = 0 ;
        int i = 1;
        
        while(i < n ){
            if(combined.charAt(i) == combined.charAt(len)){
                len++;
                lps[i]= len;
                i++;
            }else{
                if(len !=0){
                    len = lps[len - 1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        
        for(i = k + 1; i<n;i++){
            if(lps[i] == k){
                res.add(i - 2 * k);
            }
        }
        return res;
    }
}
}
