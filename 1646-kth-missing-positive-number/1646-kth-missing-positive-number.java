class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if((arr[mid]-(mid+1))<k){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return k+j+1;
    }
}