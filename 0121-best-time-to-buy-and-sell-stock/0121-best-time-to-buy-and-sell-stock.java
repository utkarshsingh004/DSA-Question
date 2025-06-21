class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int cp=prices[0];
        int sp=0;
        int profit=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(prices[i]<cp){
                cp=prices[i];
            }
            sp=prices[i];
            profit=sp-cp;
            max=Math.max(max,profit);
        }
        return max;
    }
}