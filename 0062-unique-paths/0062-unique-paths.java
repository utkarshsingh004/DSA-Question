class Solution {
    private int path(int m,int n, int dp[][]){
        if(m==1||n==1) return 1;
        if(m<=0 || n<=0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        int left=path(m,n-1,dp);
        int right=path(m-1,n,dp);
        return dp[m][n]=left+right;
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                dp[i][j]=-1;
            }
        }
        return path(m,n,dp);
    }
}