public class nextPermutation {
    class Solution {
        void nextPermutation(int [] arr){
            int i = arr.length - 2;
            
            
           while(i>=0 && arr[i] >= arr[i+1]){
               i--;
           } 
           
            if(i >= 0){
               int j = arr.length-1; 
            
            while(arr[j] <= arr[i]){
                j--;
            }
            
            swap(arr,i,j);
        }
            reverseArray(arr, i + 1);
            
        }
        
         public static void swap(int [] arr, int i , int j){
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
         }
        
        public static void reverseArray(int [] arr, int start ){
            int end = arr.length - 1;
            while(start < end ){
                swap(arr , start++ , end--);
               
            }
        }
    }
}
