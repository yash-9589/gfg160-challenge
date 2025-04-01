public class buyAndSellStoke {
    class Solution {
        public int maximumProfit(int a[]) {
            // code here
        if(a == null || a.length<2) return 0;
        
        int maxProfit = 0;
        for(int i = 1; i<a.length;i++){
            if(a[i] > a[i-1]){
                maxProfit = maxProfit + a[i] - a[i-1];
            }
        }
        return maxProfit;
        }
    }
}
