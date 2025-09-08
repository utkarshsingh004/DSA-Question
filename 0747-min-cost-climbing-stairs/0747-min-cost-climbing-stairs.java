class Solution {
    private int mini(int arr[], int idx, int dp[]){
        if(idx>=arr.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        return dp[idx]=arr[idx]+Math.min(mini(arr,idx+1,dp),mini(arr,idx+2,dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(mini(cost,0,dp),mini(cost,1,dp));
    }
}