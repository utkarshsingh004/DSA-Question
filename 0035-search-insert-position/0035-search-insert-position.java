class Solution {
    public int searchInsert(int[] arr, int target) {
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return i;
    }
}