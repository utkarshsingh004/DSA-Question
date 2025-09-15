class Solution {
    private int count(int[][] mat, int row, int col, int d, int r, int dp[][]){
        if(d>row || r>col) return 0;
        if(mat[d][r]==1) return 0;
        if(d==row && r==col) return 1;
        if(dp[d][r]!=-1) return dp[d][r];
        int a=count(mat,row,col,d+1,r,dp);
        int b=count(mat,row,col,d,r+1,dp);
        return dp[d][r]=a+b;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row=obstacleGrid.length;
        int col=obstacleGrid[0].length;
        int dp[][]=new int[row][col];
        for(int i=0;i<row;i++){
            Arrays.fill(dp[i],-1);
        }
        return count(obstacleGrid,row-1,col-1,0,0,dp);
    }
}