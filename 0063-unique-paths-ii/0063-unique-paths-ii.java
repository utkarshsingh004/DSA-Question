class Solution {
    private int helper(int [][]nums, int n, int m, int dp[][]){
        if(nums[0][0]==1) return 0;
        if(n==0 && m==0) return 1;
        if(n<0 || m<0) return 0;
        if(nums[n][m]==1) return 0;
        if(dp[n][m]!=-1) return dp[n][m];
        return dp[n][m]=helper(nums,n-1,m,dp)+helper(nums,n,m-1,dp);
    }
    public int uniquePathsWithObstacles(int[][] o) {
        int n=o.length;
        int m=o[0].length;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(o,n-1,m-1,dp);
    }
}