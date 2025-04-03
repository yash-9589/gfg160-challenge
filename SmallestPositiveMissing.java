public class SmallestPositiveMissing {
    class Solution {
        // Function to find the smallest positive number missing from the array.
        public int missingNumber(int[] arr) {
            // Your code here
            int n = arr.length;
            int [] brr = new int [1000003];
            
            for(int i =0; i<n; i++){
                if(arr[i] > 0){
                    brr[arr[i]] = 1;
                }
            }
            
            for(int i=1; i< 1000003;i++){
                if(brr[i] == 0){
                    return i;
                }
            }
            return brr.length;
        }
    }
    
}
