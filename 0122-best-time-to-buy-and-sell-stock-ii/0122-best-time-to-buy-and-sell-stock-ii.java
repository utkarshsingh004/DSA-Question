class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        Stack<Integer> s = new Stack<>();
        int profit=0;
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<prices[i]){
                s.pop();
            }
            if(s.size()==0){
               profit+=0;
            }
            else{
                profit+=s.peek()-prices[i];
                s.pop();
            }
            s.push(prices[i]);
        }
        return profit;
    }
}