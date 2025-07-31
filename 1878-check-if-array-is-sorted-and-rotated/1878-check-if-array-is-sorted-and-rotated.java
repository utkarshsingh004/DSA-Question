class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int idx=-1;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                idx=i+1;
            }
        }
        if(idx==-1){
            return true;
        }
        for(int i=idx;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        if(nums[n-1]>nums[0]){
            return false;
        }
        for(int i=0;i<idx-1;i++){
             if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
}