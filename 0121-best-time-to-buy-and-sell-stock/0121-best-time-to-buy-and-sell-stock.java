class Solution {
    public int maxProfit(int[] prices) {
       int cp=prices[0];
       int sp=0;
       int p=0;
       for(int i=1;i<prices.length;i++){
        if(cp>prices[i]){
            cp=prices[i];
        }
        sp=prices[i]-cp;
        p=Math.max(p, sp);
       } 
       return p;
    }
}