class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        HashSet<Integer> h=new HashSet<>();
        int a=Integer.MIN_VALUE+10;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                   h.add(m*i+j);
                }
            }
        }
        for(int idx:h){
            int i=idx/m;
            int j=idx%m;
            for(int k=0;k<n;k++){
                matrix[k][j]=0;
            }
            for(int k=0;k<m;k++){
                matrix[i][k]=0;
            }
        }
    }
}