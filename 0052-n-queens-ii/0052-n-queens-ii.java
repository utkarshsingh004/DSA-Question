class Solution {
    private boolean isSafe(char mat[][], int row, int col){
        int n=mat.length;
        for(int j=0;j<mat.length;j++){
            if(mat[row][j]=='Q') return false;
        }
        for(int i=0;i<mat.length;i++){
            if(mat[i][col]=='Q') return false;
        }
        int i=row;
        int j=col;
        while(i>=0 && j<mat.length){
            if(mat[i][j]=='Q') return false;
            i--;
            j++;
        }

        i=row;
        j=col;
        while(i<n && j<n){
            if(mat[i][j]=='Q') return false;
            i++;
            j++;
        }

        i=row;
        j=col;
        while(i<n && j>=0){
            if(mat[i][j]=='Q') return false;
            i++;
            j--;
        }

        i=row;
        j=col;
        while(i>=0 && j>=0){
            if(mat[i][j]=='Q') return false;
            i--;
            j--;
        }

        return true;
    }
    private void nqueen(char mat[][], int row, int n, List<List<String>> l){
        if(row==n){
          List<String> l1= new ArrayList<>();
          for(int i=0;i<n;i++){
            String str="";
            for(int j=0;j<n;j++){
                str+=mat[i][j];
            }
            l1.add(str);
          }
          l.add(l1);
          return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(mat,row,j)){
                mat[row][j]='Q';
                nqueen(mat,row+1,n,l);
                mat[row][j]='.';
            }
        }
    }
    public int totalNQueens(int n) {
        List<List<String>> l= new ArrayList<>();
        if(n==3 || n==2) return 0;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        nqueen(board,0,n,l);
        return l.size();
    }
}