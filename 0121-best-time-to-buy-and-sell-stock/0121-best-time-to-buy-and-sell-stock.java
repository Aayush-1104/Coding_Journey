class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n==0){
            return 0;
        }    
        int profit=0;
        int buy=prices[0];
        int max=0;
        for(int i=1;i<n;i++){
            profit= prices[i]-buy;
        
            if(profit>max){
                max=profit;
            }
            if(profit<0) buy = prices[i];
        }
        return max;
    }
}