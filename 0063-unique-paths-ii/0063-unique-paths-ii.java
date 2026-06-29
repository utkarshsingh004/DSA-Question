class Solution {
    // private int helper(int [][]nums, int n, int m, int dp[][]){
    //     if(n==0 && m==0) return 1;
    //     if(n<0 || m<0) return 0;
    //     if(nums[n][m]==1) return 0;
    //     if(dp[n][m]!=-1) return dp[n][m];
    //     return dp[n][m]=helper(nums,n-1,m,dp)+helper(nums,n,m-1,dp);
    // }
    public int uniquePathsWithObstacles(int[][] o) {
        int n=o.length;
        int m=o[0].length;
        if(o[0][0]==1) return 0;
        if(o[n-1][m-1]==1) return 0;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(o[i][j]==1) dp[i][j]=0;
                else dp[i][j]=-1;
            }
        }
        for(int j=0;j<m;j++){
            if(o[0][j]==1){
                for(int i=j;i<m;i++) dp[0][i]=0;
                break;
            };
            dp[0][j]=1;
        }
        for(int i=0;i<n;i++){
           if(o[i][0]==1){
            for(int j=i;j<n;j++) dp[j][0]=0;
            break;
           }
           dp[i][0]=1;
        }
      
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
               if(dp[i][j]!=0) dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[n-1][m-1];
    }
}