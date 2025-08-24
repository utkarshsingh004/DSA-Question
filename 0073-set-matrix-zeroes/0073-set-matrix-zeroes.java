class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int a=Integer.MIN_VALUE+10;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][j]=-1;
                    for(int k=0;k<m;k++){
                        if(matrix[i][k]!=0){
                            matrix[i][k]=a;
                        }
                    }
                    for(int k=0;k<n;k++){
                        if(matrix[k][j]!=0){
                            matrix[k][j]=a;
                        }
                    }
                }
            }
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==a){
                    matrix[i][j]=0;
                }
            }
         }
    }
}