class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n==0){
            return 0;
        }    
        int profit=0;
        int min=prices[0];
        for(int i=1;i<n;i++){
            min=Math.min(prices[i],min);
            if(prices[i]>prices[i-1]){
                profit=Math.max(profit,(prices[i]-min));
            }
        }
        return profit;
    }
}