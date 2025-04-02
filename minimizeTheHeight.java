import java.util.Arrays;

public class minimizeTheHeight {
    
    
class Solution {
    int getMinDiff(int[] arr, int k ) {
        // code here
        int n=arr.length;
        int min = 0; int max = 0; int r=0;
        Arrays.sort(arr);
        r=arr[n-1] - arr[0];
        for(int i =1;i<n;i++){
            if(arr[i] >=k ){
                max=Math.max(arr[i-1]+k,arr[n-1]-k);
                 min=Math.min(arr[i]-k,arr[0]+k);
                 r=Math.min(r,max-min);
            }else{
                continue;
            }
        }
        return r;
    }
}

}
