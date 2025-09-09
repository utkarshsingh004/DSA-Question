class Solution {
    private int climb(int i, int n, int dp[]){
        if(i==n){
            return 1;
        }
        if(i>n) return 0;
        if(dp[i]!=-1) return dp[i];
        int step=climb(i+1,n,dp);
        int step2=climb(i+2,n,dp);
        return dp[i]=step+step2;
    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return climb(0,n,dp);
    }
}