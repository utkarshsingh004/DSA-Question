class Solution {
    private int helper(int nums[][], int n, int m, int dp[][]){
        if(n==0 && m==0) return nums[n][m];
        if(n<0 || m<0) return Integer.MAX_VALUE;
        if(dp[n][m]!=-1) return dp[n][m];
        int l=helper(nums, n-1,m,dp);
        int u=helper(nums,n,m-1,dp);
        return dp[n][m]=Math.min(l,u)+nums[n][m];
    }
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dp[][] = new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(grid,n-1,m-1,dp);        
    }
}