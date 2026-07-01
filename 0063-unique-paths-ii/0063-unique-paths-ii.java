class Solution {
    // private int helper(int [][]nums, int n, int m, int dp[][]){
    //     if(n==0 && m==0) return 1;
    //     if(n<0 || m<0) return 0;
    //     if(nums[n][m]==1) return 0;
    //     if(dp[n][m]!=-1) return dp[n][m];
    //     return dp[n][m]=helper(nums,n-1,m,dp)+helper(nums,n,m-1,dp);
    // }
    public int uniquePathsWithObstacles(int[][] nums ) {
       int n=nums.length;
       int m=nums[0].length;
       if(nums[0][0]==1) return 0;
       int dp[][] = new int [n][m];
       dp[0][0]=1;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(nums[i][j]==1){
                dp[i][j]=0;
                continue;
            }
            if(i==0 && j>0) dp[i][j]=dp[i][j-1];
            else if(j==0 && i>0) dp[i][j]=dp[i-1][j];
            else if(i>0 && j>0) dp[i][j]=dp[i-1][j]+dp[i][j-1];
        }
       }
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(dp[i][j]+" ");
        }
       }
       return dp[n-1][m-1];
    }
}