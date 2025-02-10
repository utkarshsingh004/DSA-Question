class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int idx=0;
        for(int i=0;i<n-1;i++){
           if(nums[i]>nums[i+1]){
            idx=i+1;
            break;
           }
        }
        if(idx==0){
            return true;
        }
        for(int i=0;i<idx-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }

         for(int i=idx;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        if(nums[0]<nums[n-1]){
            return false;
        }
        return true;
    }
}