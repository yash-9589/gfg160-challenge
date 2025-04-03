public class maximumSubArrayKadanesAlgorithm {
    class Solution {
        long maxSubarraySum(int[] arr) {
            // Your code here
            int n = arr.length;
            long maxi = Long.MIN_VALUE;
            int sum = 0;
            
            for(int i = 0; i<n;i++){
                
                sum +=arr[i];
                
                if(sum > maxi){
                    maxi = sum;
                    
                }
                
                if(sum<0){
                    sum=0;
                }
            }
            return maxi;
        }
    }
    
}
