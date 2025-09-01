class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            while(i<mid && nums[mid]==nums[i]) i++;
            while(mid<j && nums[mid]==nums[j]) j--;
            if(nums[mid]==target){
                return true;
            }
            else if(nums[i]<=nums[mid]){
                if(nums[i]<=target && target<=nums[mid]){
                   j=mid-1;
                }
                else{
                     i=mid+1;
                }
            }
            else{
                if(nums[mid]<=target && target<=nums[j]){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
            }
        }
        return false;
    }
}