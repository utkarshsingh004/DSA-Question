class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int i=0;
        int j=n-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            else if(nums[mid]>nums[n-1]){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return nums[i];
    }
}