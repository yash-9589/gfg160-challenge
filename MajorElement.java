import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MajorElement {
    
class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int cnd1 = Integer.MIN_VALUE , cnd2 = Integer.MIN_VALUE;
        int cnt1 = 0 , cnt2 = 0;
        
        for(int num : nums){
            if(num == cnd1){
                cnt1++;
            }else if(num == cnd2){
                cnt2++;
            }else if (cnt1 == 0){
                cnd1 = num;
                cnt1 = 1;
            }else if (cnt2 == 0){
                cnd2 = num;
                cnt2 = 1;
        }else{
            cnt1--;
            cnt2--;
        }
    }
    
    cnt1 = 0;
    cnt2 = 0;
    for(int num : nums ){
        if(num == cnd1) cnt1++;
        else if (num == cnd2) cnt2++;
    }
    
    List<Integer> result = new ArrayList<>();
    int n = nums.length;
    if(cnt1 > n/3) result.add(cnd1);
    if(cnt2 > n/3 && cnd1 != cnd2) result.add(cnd2);
    
    Collections.sort(result);
    return result;
}
}

}
