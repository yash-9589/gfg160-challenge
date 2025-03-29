public class reverseArray {
    class Solution {
        public void reverseArray(int arr[]) {
            int l = arr.length;
            int  n = Math.floorDiv(l,2);// use to find half of the array length (5,2) = 2(not = 2.5)
            int temp;
            
            for(int i = 0; i<n;i++){
                //swap
                temp = arr[i];
                arr[i]=arr[l-i-1];
                arr[l-i-1] = temp;
            }
        }
    }
}
