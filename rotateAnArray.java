public class rotateAnArray {
    
class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    
    public static void Reverse(int [] arr , int start , int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    

    
    public static void rotateArr(int[] arr, int d) {
        // add your code here
        int n = arr.length;
        
        if(d == 0 || d%n ==0) return;
        d = d % n;
   Reverse(arr, 0, d-1);
   Reverse(arr, d, n-1);
   Reverse(arr, 0, n-1);
    }
}
}
