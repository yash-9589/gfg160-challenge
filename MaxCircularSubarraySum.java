import java.util.Arrays;

public class MaxCircularSubarraySum {
    
class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.


        // Your code here
        
       
        int kadanesMax(int [] nums , int n ){
            int sum = nums[0];
            int maxSum = nums[0]; 
            for(int i=1;i<n;i++){
                sum = Math.max(sum + nums[i], nums[i]);
                maxSum = Math.max(maxSum, sum);
            }
            return maxSum;
        }
        
         int kadanesMin(int [] nums , int n ){
            int sum = nums[0];
            int minSum = nums[0];
            for(int i=1;i<n;i++){
                sum = Math.min(sum + nums[i], nums[i]);
                minSum = Math.min(minSum, sum);
            }
            return minSum;
        }
        
           int circularSubarraySum(int nums[]) {
                 int n = nums.length;
        int SUM = Arrays.stream(nums).sum();
        
        int minSum= kadanesMin(nums , n);
         int maxSum= kadanesMax(nums , n);
         
         int circSum = SUM - minSum;
         
         if(maxSum > 0){
             return Math.max(maxSum,circSum);
         }
         return maxSum;
        
    }
}

}
