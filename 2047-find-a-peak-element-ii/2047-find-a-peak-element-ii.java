class Solution {
    private int maximum(int arr[][],int m){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[max][m]<arr[i][m]) max=i;
        }
        return max;
    }
    public int[] findPeakGrid(int[][] mat) {
        int arr[] = new int[2];
        int n=mat.length;
        int m=mat[0].length;
        if(n==1 && m==1){
            return new int[]{0,0};
        }
        int zeroIdx=maximum(mat,0);
        if(mat[zeroIdx][0]>mat[zeroIdx][1]){
            arr[0]=zeroIdx;
            arr[1]=0;
            return arr;
        }
        int lastIdx=maximum(mat,m-1);
        if(mat[lastIdx][m-1]>mat[lastIdx][m-2]){
            arr[0]=lastIdx;
            arr[1]=m-1;
            return arr;
        }

        int i=1;
        int j=m-2;
        while(i<=j){
            int mid=i+(j-i)/2;
            int idx=maximum(mat,mid);
            if(mat[idx][mid]>mat[idx][mid-1] && mat[idx][mid]>mat[idx][mid+1]){
                arr[0]=idx;
                arr[1]=mid;
                return arr;
            }
            else if(mat[idx][mid]<mat[idx][mid-1]){
                j=mid-1;
            }
            else if(mat[idx][mid]<mat[idx][mid+1]) i=mid+1;
        }
        return new int[]{-1,-1};
    }
}