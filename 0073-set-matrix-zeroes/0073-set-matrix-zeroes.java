class Solution {

    private void zero(int[][] arr, int i, int j){
        for(int l=0;l<arr.length;l++){
            // arr[i][l]=Integer.MIN_VALUE;
            if(arr[l][j]!=0){
              arr[l][j]=Integer.MAX_VALUE-10;
            }  
           
        }
        for(int l=0;l<arr[i].length;l++){
            if(arr[i][l]!=0){
                arr[i][l]=Integer.MAX_VALUE-10;
            }
            // arr[l][j]=Integer.MIN_VALUE;
        }
    }


    public void setZeroes(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    zero(matrix, i, j);
                }
            }
        }
       for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==Integer.MAX_VALUE-10){
                    matrix[i][j]=0;
                }
            }
        }
    }
}