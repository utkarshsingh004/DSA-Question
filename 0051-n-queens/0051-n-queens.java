class Solution {
    private boolean isValid(char board[][], int row, int col ,int n){
        int i,j;

        // for col
        for(j=0;j<n;j++){
            if(board[row][j]=='Q') return false;
        }

        // for row
        for(i=0;i<n;i++){
            if(board[i][col]=='Q') return false;
        }

        // for 1-diagonal
        i=row;
        j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }

        // for 2-diagonal
        i=row;
        j=col;
        while(i<n && j<n){
            if(board[i][j]=='Q') return false;
            i++;
            j++;
        }

        // for 3-diagonal
        i=row;
        j=col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }

        // for 4-diagonal
        i=row;
        j=col;
        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }

        return true;
    }
    private void helper(int n, char board[][], int idx, List<List<String>> res){
        if(idx==n){
             List<String> l=new ArrayList<>();
            for(int i=0;i<n;i++){
                String ans="";
                for(int j=0;j<n;j++){
                    ans+=(board[i][j]);
                }
                l.add(ans);
            }
            res.add(new ArrayList<>(l));
            return;
        }
        for(int j=0;j<n;j++){
            if(isValid(board,idx,j,n)){
                board[idx][j]='Q';
                helper(n,board,idx+1,res);
                board[idx][j]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        helper(n,board,0,res);
        return res;
    }
}