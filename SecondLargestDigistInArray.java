class Solution {
    public static int getSecondLargest(int[] arr) {
            if(arr.length<2) return -1;
            
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
            
            for(int nums : arr){
                if(nums>largest){
                    secondLargest = largest;
                    largest = nums;
                }else if(nums < largest && nums > secondLargest){
                    secondLargest = nums;
                }
            }
            return (secondLargest == Integer.MIN_VALUE)? -1 : secondLargest;
        }
    
        public static void main(String[] args) {
            int [] arr = {1,4,6,3,7,3};
                    System.out.println("second Largest Digit ="+ " " + getSecondLargest(arr));
                
    }
}