class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int arr[] = new int [2];
        int max=0;
        int idx=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
             if (count > max) {
                max = count;
                idx = i;
            }
        }
        arr[0]=idx;
        arr[1]=max;
        return arr;
    }
}