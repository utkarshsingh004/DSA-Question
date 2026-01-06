class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int cp=prices[0];
        int sp=0;
        int profit=0;
        for(int i=1;i<n;i++){
            if(cp>prices[i]) cp=prices[i];
            profit=Math.max(profit,prices[i]-cp);
        }
        return profit;
    }
}