class Solution {
    private int fO(int nums[], int target){
        int i=0;
        int j=nums.length-1;
        int idx=-1;
        while(i<=j){
            int mid=(i+(j-i)/2);
            if(nums[mid]==target){
                idx=mid;
                j=mid-1;
            }
            else if(nums[mid]>target) j=mid-1;
            else i=mid+1;
        }
        return idx;
    }
    private int lO(int nums[], int target){
        int i=0;
        int j=nums.length-1;
        int idx=-1;
        while(i<=j){
            int mid=(i+(j-i)/2);
            if(nums[mid]==target){
                idx=mid;
                i=mid+1;
            }
            else if(nums[mid]<target) i=mid+1;
            else j=mid-1;
        }
        return idx;
    }
    public int[] searchRange(int[] nums, int target) {
       int a=fO(nums,target);
       int b=lO(nums,target);
       return new int[]{a,b};
    }
}