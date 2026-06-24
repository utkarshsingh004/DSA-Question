class Solution {
    private int helper(int mat[][], int mid){
        int n=mat.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(mat[max][mid]<mat[i][mid]) max=i;
        }
        return max;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int fo=helper(mat,0);
        if(n==1 && m==1) return new int[] {0,0};
        if(mat[fo][0]>mat[fo][1]) return new int[]{fo,0};

        int lo=helper(mat,m-1);
        if(mat[lo][m-1]>mat[lo][m-2]) return new int[] {lo,m-1};

        int i=1;
        int j=m-2;
        while(i<=j){
            int mid=i+(j-i)/2;
            int idx=helper(mat,mid);
            if(mat[idx][mid]>mat[idx][mid-1] && mat[idx][mid]>mat[idx][mid+1]) return new int[]{idx,mid};
            else if(mat[idx][mid]>mat[idx][mid-1] && mat[idx][mid]<mat[idx][mid+1]) i=mid+1;
            else j=mid-1;
        }
        return new int[] {-1,-1};
    }
}