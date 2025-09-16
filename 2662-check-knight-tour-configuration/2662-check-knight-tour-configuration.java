class Solution {
    private boolean checkMove(int grid[][], int row, int col, int num){
        int n=grid.length;
        if(num==n*n-1) return true;
        int i,j;

        // 2-up 1-right
        i=row-2;
        j=col+1;
        if(i>=0 && j<n && grid[i][j]==num+1) return checkMove(grid,i,j,num+1);
        
        // 2-up 1-left
        i=row-2;
        j=col-1;
        if(i>=0 && j>=0 && grid[i][j]==num+1) return checkMove(grid,i,j,num+1);

        // 2-right 1-bottom
        i=row+1;
        j=col+2;
        if(i<n && j<n && grid[i][j]==num+1) return checkMove(grid,i,j,num+1);

        // 2-rigth 1-up
        i=row-1;
        j=col+2;
        if(i>=0 && j<n && grid[i][j]==num+1) return checkMove(grid,i,j,num+1);

        // 2-bottom 1-right
        i=row+2;
        j=col+1;
        if(i<n && j<n && grid[i][j]==num+1) return checkMove(grid,i,j,num+1);

        // 2-bottom 1-left
        i=row+2;
        j=col-1;
        if(i<n && j>=0 && grid[i][j]==num+1) return checkMove(grid,i,j,num+1);

        // 1-bottom 2-left
        i=row+1;
        j=col-2;
        if(i<n && j>=0 && grid[i][j]==num+1) return checkMove(grid,i,j,num+1);

        // 1-up 2-left
        i=row-1;
        j=col-2;
        if(i>=0 && j>=0 && grid[i][j]==num+1) return checkMove(grid,i,j,num+1);
        return false;
    }
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0) return false;
        return checkMove(grid,0,0,0);
    }
}